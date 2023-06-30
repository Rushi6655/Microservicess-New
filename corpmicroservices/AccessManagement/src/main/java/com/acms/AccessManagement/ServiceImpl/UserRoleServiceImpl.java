package com.acms.AccessManagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.acms.AccessManagement.Dto.AmsAppMaster;
import com.acms.AccessManagement.Dto.AmsAppModule;
import com.acms.AccessManagement.Dto.RoleMasterDto;
import com.acms.AccessManagement.Dto.UserRoleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acms.AccessManagement.Entity.UserRole;
import com.acms.AccessManagement.Repo.UserRoleRepo;
import com.acms.AccessManagement.Service.UserRoleService;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleRepo userRoleRepo ;
	@Override
	public UserRole findbyUserRole(int urId) {
		return userRoleRepo.findById(urId);
	}

	@Override
	public String assignUserRole(UserRole userRole) {
		userRoleRepo.save(userRole);
		return "inserted";
	}

	public List<UserRole>getallUserrole() {
		return userRoleRepo.findAll();
	}

	@Override
	public List<RoleMasterDto> getEmployeeRoleList(int uId) {
		List<RoleMasterDto> roles=new ArrayList<>();
		roles=userRoleRepo.getEmployeeRoleList(uId).stream().map((temp)->{
				RoleMasterDto tempRole = new RoleMasterDto();
				tempRole.setRoleId((Integer) temp[0]);
				tempRole.setRoleName((String) temp[1]);
				tempRole.setStart_date( temp[2].toString());
				tempRole.setEnd_date(temp[3].toString());
				return tempRole;
		}).collect(Collectors.toList());
		return roles;
	}
	public List<UserRoleDto> getUserRoleData(){
		List<Object[]> userrole=userRoleRepo.getUserRoleData();
		List<UserRoleDto> userRoleDtos=userrole.stream().map(temp->{
			UserRoleDto dto=new UserRoleDto();
			dto.setRoleId((Integer)temp[0]);
			dto.setUserId((Integer)temp[1]);
			dto.setRoleName((String) temp[2]);
			dto.setUserName((String) temp[3]);
			dto.setEndDate(temp[4].toString());
			dto.setStartDate( temp[5].toString());
			dto.setApplication(getApplicationModulesByRoleId((Integer)temp[0]));
			return dto;
		}).collect(Collectors.toList());
		return  userRoleDtos;
	};

	@Override
	public Integer totalCountOfUserRoles() {
		return userRoleRepo.totalCountOfUserRoles();
	}
	@Override
	public List<UserRoleDto> getAllActiveUserRoleData() {
		List<Object[]> activeuserrole=userRoleRepo.getAllActiveUserRoleData();
		List<UserRoleDto> userRoleDtos=activeuserrole.stream().map(temp->{
			UserRoleDto dto=new UserRoleDto();
			dto.setRoleId((Integer)temp[0]);
			dto.setUserId((Integer)temp[1]);
			dto.setRoleName((String) temp[2]);
			dto.setUserName((String) temp[3]);
			dto.setEndDate(temp[4].toString());
			dto.setStartDate( temp[5].toString());
			return dto;
		}).collect(Collectors.toList());
		return  userRoleDtos;
		
	}

	public List<UserRoleDto> getAllInactiveUserRoleData() {
		List<Object[]> inActiveuserrole=userRoleRepo.getAllInactiveUserRoleData();
	
		List<UserRoleDto> userRoleDtos=inActiveuserrole.stream().map(temp->{
			UserRoleDto dto=new UserRoleDto();
			dto.setRoleId((Integer)temp[0]);
			dto.setUserId((Integer)temp[1]);
			dto.setRoleName((String) temp[2]);
			dto.setUserName((String) temp[3]);
			dto.setEndDate(temp[4].toString());
			dto.setStartDate( temp[5].toString());
			return dto;
		}).collect(Collectors.toList());
		
		return  userRoleDtos;
	}

	@Override
	public List<AmsAppMaster> getApplicationModulesByRoleId(int roleId) {
		List<Object[]> listOfAppModules=userRoleRepo.getApplicationModulesByRoleId(roleId);
		int flag = 0;
		int count = 0;
		AmsAppMaster tempMaster = new AmsAppMaster();
		AmsAppModule tempobject = new AmsAppModule();
		List<AmsAppModule> listofmodules = new ArrayList<>();
		List<AmsAppMaster> listofApps = new ArrayList<>();

		for (Object[] ob:listOfAppModules) {
			int temp =(Integer) ob[0];
			if (count == 0) {
				flag = temp;
			}
			if (flag == temp) {
				flag = temp;
				tempobject = new AmsAppModule();
				tempobject.setAppId((Integer) ob[0]);
				tempobject.setAppModuleName((String) ob[1]);
				tempobject.setAppModuleId((Integer) ob[2]);
				tempobject.setAppModuleName((String) ob[3]);
				tempobject.setWriteAccess(ob[4]+"");
				tempobject.setReadAccess(ob[5]+"");
				tempobject.setDeleteAccess(ob[6]+"");
				tempobject.setEditAccess(ob[7]+"");
				listofmodules.add(tempobject);
			} else {
				tempMaster.setModules(listofmodules);
				listofApps.add(tempMaster);
				listofmodules = new ArrayList<>();
				tempMaster = new AmsAppMaster();
				tempobject = new AmsAppModule();
				tempobject.setAppId((Integer) ob[0]);
				tempobject.setAppModuleName((String) ob[1]);
				tempobject.setAppModuleId((Integer) ob[2]);
				tempobject.setAppModuleName((String) ob[3]);
				tempobject.setWriteAccess(ob[4]+"");
				tempobject.setReadAccess(ob[5]+"");
				tempobject.setDeleteAccess(ob[6]+"");
				tempobject.setEditAccess(ob[7]+"");
				listofmodules.add(tempobject);
				flag = temp;
			}
			tempMaster.setAppId(temp);
			tempMaster.setAppName((String) ob[1]);
			count++;
		}
		tempMaster.setModules(listofmodules);
		listofApps.add(tempMaster);
		return listofApps;
	}

}
