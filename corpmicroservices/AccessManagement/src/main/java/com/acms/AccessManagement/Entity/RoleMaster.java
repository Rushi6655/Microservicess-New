package com.acms.AccessManagement.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "role_master")
public class RoleMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;
    @Column(name = "role")
    private String roleName;
    @Column(name = "created_by")
    private int createdBy;
    @Column(name = "created_date")
    private String cretedDate;


    public int getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public String getCretedDate() {
        return cretedDate;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setCretedDate(String cretedDate) {
        this.cretedDate = cretedDate;
    }

}
