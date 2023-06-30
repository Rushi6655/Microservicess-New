package com.acms.AccessManagement.Controller;

import com.acms.AccessManagement.Dto.AmsAppMaster;
import com.acms.AccessManagement.Entity.RoleMaster;
import com.acms.AccessManagement.Entity.UserRole;
import com.acms.AccessManagement.ServiceImpl.EmployeeMasterServiceImpl;
import com.acms.AccessManagement.ServiceImpl.RoleMasterServiceImpl;
import com.acms.AccessManagement.ServiceImpl.UserRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping("/userrole")
public class UserRoleController {
    @Autowired
    private UserRoleServiceImpl userRoleService;
    @Autowired
    private RoleMasterServiceImpl roleService;

    @Autowired
    private EmployeeMasterServiceImpl employeeMasterService;
    @Autowired
    private RestTemplate template;
    
    @PostMapping("/assign")
    public String assignUserRole(@RequestBody UserRole role){
        System.out.println(role.toString());
        return userRoleService.assignUserRole(role);
    }

    @GetMapping("/getUserRole/{userId}")
    public ResponseEntity<Map<String,Object>> userRolePageData(@PathVariable("userId") int userId){
        Map<String,Object> pagedata=new HashMap<>();
        Object employee=template.getForObject("http://localhost:6000/login/"+userId, Object.class);
        if(employee!=null){
            pagedata.put("userRoles",
                    userRoleService.getEmployeeRoleList(userId).size()>0?userRoleService.getEmployeeRoleList(userId):"No Roles Assigned To User");
            pagedata.put("employeeDetails",employee);
            pagedata.put("allEmployeeList",employeeMasterService.findAll());
            pagedata.put("allRoleList",roleService.getAllRole());
            pagedata.put("allUserRoles",userRoleService.getUserRoleData());
            pagedata.put("status",HttpStatus.FOUND);
        }else{
            pagedata.put("status",HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(pagedata, HttpStatus.FOUND);
    }

    @GetMapping("/getRoleAccessByID/{roleId}")
    public ResponseEntity< List<AmsAppMaster>> getRoleAccessById(@PathVariable int roleId){
        return new ResponseEntity<>(userRoleService.getApplicationModulesByRoleId(roleId),HttpStatus.FOUND);
    }
   
}
