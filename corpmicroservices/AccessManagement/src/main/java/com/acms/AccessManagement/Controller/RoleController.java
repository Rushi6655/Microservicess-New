package com.acms.AccessManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acms.AccessManagement.Entity.RoleMaster;
import com.acms.AccessManagement.Entity.UserRole;
import com.acms.AccessManagement.ServiceImpl.RoleMasterServiceImpl;

@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
    RoleMasterServiceImpl roleService;
    @PostMapping("/createRole")
    public String createRole(@RequestBody RoleMaster role){
        System.out.println(role.toString());
        return roleService.createRole(role);
    }
    @GetMapping("/getAllRole")
    public List<RoleMaster> getAllRole(){
        return roleService.getAllRole();
    }

}
