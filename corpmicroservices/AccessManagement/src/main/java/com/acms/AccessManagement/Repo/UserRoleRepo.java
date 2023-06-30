package com.acms.AccessManagement.Repo;

import java.util.List;
import java.util.Objects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.acms.AccessManagement.Dto.RoleDto;
import com.acms.AccessManagement.Entity.UserRole;
@Repository
public interface UserRoleRepo extends JpaRepository<UserRole, Integer> {

	 String getUserRoleDataQuery=" SELECT ur.role_id,em.Staff_ID,rm.role, " +
			" CONCAT(em.F_Name ,' ', em.L_Name) as Name, " +
			" ur.end_date,ur.start_date " +
			" FROM user_role ur, role_master rm, employee_master em " +
			" WHERE em.date_of_departure IS null " +
			" AND ur.role_id=rm.role_id " +
			" AND ur.user_id=em.Staff_ID " +
			" AND ur.deleted_by is null " +
			" AND ur.start_Date <= current_timestamp() " +
			" AND ur.end_date >= current_timestamp() " +
			" ORDER BY F_Name;";
	 
	 String getInactiveUserRoleDataQuery="SELECT ur.role_id,em.Staff_ID,em.Email_ID,rm.role, "
	 		+ "		 CONCAT(em.F_Name ,' ', em.L_Name) as Name,"
	 		+ "		 ur.created_by,ur.created_date, ur.end_date,ur.start_date"
	 		+ "		 FROM user_role ur, role_master rm, employee_master em "
	 		+ "		 WHERE em.date_of_departure IS null"
	 		+ "		 AND ur.role_id=rm.role_id"
	 		+ "		 AND ur.user_id=em.Staff_ID"
	 		+ "		 AND ur.end_date < current_timestamp()"
	 		+ "		 ORDER BY F_Name";
	 
	 String getactiveUserRoleDataQuery="SELECT ur.role_id,em.Staff_ID,em.Email_ID,rm.role,CONCAT(em.F_Name ,' ', em.L_Name) as Name,ur.created_by,ur.created_date, "
	 		+ "		 ur.end_date,ur.start_date FROM user_role ur, role_master rm, employee_master em "
	 		+ "		 WHERE em.date_of_departure IS null "
	 		+ "		 AND ur.role_id=rm.role_id AND ur.user_id=em.Staff_ID AND ur.deleted_by is null "
	 		+ "		 AND ur.start_Date <= current_timestamp() "
	 		+ "		 AND ur.end_date >= current_timestamp() ORDER BY F_Name";

	String getApplicationModuleByRoleIdQuery="SELECT am.Project_ID,am.Project_Name,md.use_case_id, " +
			"md.use_case_name ,rbac.write_access,rbac.read_access,rbac.delete_access,rbac.edit_access " +
			"FROM project am,use_cases md, rbac_master rbac " +
			"WHERE am.Project_ID=md.project_id " +
			"AND md.use_case_id=rbac.use_case_id AND rbac.role_id=?1 " +
			"AND md.deleted_by is null AND am.deleted_by is null order by am.Project_ID ; ";

	public UserRole findById(int urId);
	public List<UserRole> findAll();
	@Query(value="Select rm.role_id,rm.role,ur.start_date,ur.end_date from user_role ur,role_master rm where user_id=:uId and rm.role_id=ur.role_id and ur.end_date>=current_timestamp();",nativeQuery =true)
	public List<Object[]> getEmployeeRoleList(int uId);
	
	@Query(value="select count(role_id) from user_role where deleted_by is null AND start_date<=current_timestamp() AND end_date >=current_timestamp() ;",nativeQuery =true)
	public Integer totalCountOfUserRoles();

	@Query(value = getUserRoleDataQuery,nativeQuery = true)
	public List<Object[]> getUserRoleData();
	
	@Query(value=getactiveUserRoleDataQuery,nativeQuery =true)
	public List<Object[]> getAllActiveUserRoleData();

	@Query(value = getInactiveUserRoleDataQuery,nativeQuery = true)
	public List<Object[]> getAllInactiveUserRoleData();


	@Query(value = getApplicationModuleByRoleIdQuery,nativeQuery = true)
	public List<Object[]> getApplicationModulesByRoleId(int roleId);


}
