package com.acms.AccessManagement.Entity;

import com.acms.AccessManagement.Dto.UserRoleKeys;
import jakarta.persistence.*;
@Entity
@Table(name = "user_role")
@IdClass(UserRoleKeys.class)
public class UserRole{

    @Id
    @Column(name = "role_id")
    private int roleId;
    @Id
    @Column(name = "user_id")
    private int userId;
    @Column(name = "start_date")
    private String startDate;
    @Column(name = "end_date")
    private String endDate;
    @Column(name = "created_by")
    private int createdBy;
    @Column(name = "created_date")
    private String cretedDate;

    public int getUserId() {
        return userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public String getCretedDate() {
        return cretedDate;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setCretedDate(String cretedDate) {
        this.cretedDate = cretedDate;
    }

}
