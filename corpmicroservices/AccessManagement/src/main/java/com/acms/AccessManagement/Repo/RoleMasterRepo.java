package com.acms.AccessManagement.Repo;

import com.acms.AccessManagement.Entity.RoleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMasterRepo extends JpaRepository< RoleMaster,Integer > {
    public RoleMaster findById(int id);

    
    @Query(value="select count(role_id) from role_master where deleted_by is null  ;",nativeQuery =true)
	public Integer totalRoleCount();

    @Query(value="select count(project_module_id) from ams_app_module where deleted_by is null  ;",nativeQuery =true)
	public Integer totalAppCount();
}
