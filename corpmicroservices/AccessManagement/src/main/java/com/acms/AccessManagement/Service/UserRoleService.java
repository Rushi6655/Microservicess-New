package com.acms.AccessManagement.Service;

import java.util.List;

import com.acms.AccessManagement.Dto.AmsAppMaster;
import com.acms.AccessManagement.Dto.RoleDto;
import com.acms.AccessManagement.Dto.RoleMasterDto;
import com.acms.AccessManagement.Dto.UserRoleDto;
import com.acms.AccessManagement.Entity.RoleMaster;
import com.acms.AccessManagement.Entity.UserRole;

public interface UserRoleService {
	public UserRole findbyUserRole(int urId);
	public String assignUserRole(UserRole userRole);
	public List<UserRole>getallUserrole();

	public List<RoleMasterDto> getEmployeeRoleList(int uId);
	Integer totalCountOfUserRoles();
	public List<UserRoleDto> getUserRoleData();
	public List<UserRoleDto> getAllActiveUserRoleData();
	public List<UserRoleDto> getAllInactiveUserRoleData();
	public List<AmsAppMaster> getApplicationModulesByRoleId(int roleId);

}
