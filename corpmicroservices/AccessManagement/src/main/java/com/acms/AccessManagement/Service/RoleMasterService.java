package com.acms.AccessManagement.Service;

import com.acms.AccessManagement.Entity.RoleMaster;

import java.util.List;

import javax.swing.text.html.parser.Entity;

public interface RoleMasterService {
    public RoleMaster getRoleById(int id);
    public String createRole(RoleMaster role);
    public List<RoleMaster> getAllRole();
    public Integer totalRoleCount();
	public Integer totalAppCount();
}
