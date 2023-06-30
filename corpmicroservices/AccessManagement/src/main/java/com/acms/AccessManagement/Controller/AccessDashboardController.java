package com.acms.AccessManagement.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acms.AccessManagement.ServiceImpl.RoleMasterServiceImpl;
import com.acms.AccessManagement.ServiceImpl.UserRoleServiceImpl;

@RestController
@RequestMapping("/accessDash")
public class AccessDashboardController {
	
	@Autowired
	UserRoleServiceImpl  userRoleServiceImpl;
	
	@Autowired
	RoleMasterServiceImpl roleMasterImpl ;

	@GetMapping("/acessTotalUserRoles")
	public Map<String,Object> getAllDashbordDetatails()
	{
		Map map=new HashMap<>();
		map.put("TotalUserRoles", userRoleServiceImpl.totalCountOfUserRoles());
		return map;
	}
	
	
	@GetMapping("/acessTotalRoles")
	public Map<String,Object> getAllDashRoles()
	{
		Map map=new HashMap<>();
		map.put("TotalRoles", roleMasterImpl.totalRoleCount());
		return map;
	}
	
	@GetMapping("/acessTotalApplication")
	public Map<String,Object> getAllApplications()
	{
		Map map=new HashMap<>();
		map.put("TotalApplication", roleMasterImpl.totalAppCount());
		return map;
	}

	@GetMapping("/displayAllDashboardPageDetails")
	public Map<String,Object> displayAllDashboardPageDetails()
	{
		Map<String,Object> allinmap=new HashMap<>();
		allinmap.put("TotalApplication", roleMasterImpl.totalAppCount());
		allinmap.put("TotalRoles", roleMasterImpl.totalRoleCount());
		allinmap.put("TotalUserRoles", userRoleServiceImpl.totalCountOfUserRoles());
		allinmap.put("totalInactiveuser", userRoleServiceImpl.getAllInactiveUserRoleData());
		allinmap.put("totalActiveUaserRole", userRoleServiceImpl.getAllActiveUserRoleData());
		return allinmap;
	}

	
}
