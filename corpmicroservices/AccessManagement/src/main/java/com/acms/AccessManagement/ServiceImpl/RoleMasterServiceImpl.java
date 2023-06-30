package com.acms.AccessManagement.ServiceImpl;

import com.acms.AccessManagement.Entity.RoleMaster;
import com.acms.AccessManagement.Repo.RoleMasterRepo;
import com.acms.AccessManagement.Service.RoleMasterService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleMasterServiceImpl implements RoleMasterService {
    @Autowired
    RoleMasterRepo repo;
    @Override
    public RoleMaster getRoleById(int id) {
        return repo.findById(id);
    }
	public String createRole(RoleMaster role) {
		
		repo.save(role);
		return "Role added successfully";
		}
	public List<RoleMaster> getAllRole() {
		
		return repo.findAll() ;
	}
	public Integer totalRoleCount() {
		return repo.totalRoleCount();
		 
		
	}
	public Integer totalAppCount() {
		
		return repo.totalAppCount();
	}
}
