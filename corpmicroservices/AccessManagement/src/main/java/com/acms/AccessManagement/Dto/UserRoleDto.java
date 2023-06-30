package com.acms.AccessManagement.Dto;


import java.time.LocalDateTime;
import java.util.List;

public class UserRoleDto {

    private int userId;
    private String userName;
    private int roleId;
    private String roleName;
    private String endDate;
    private String startDate;
    private List<AmsAppMaster> application;
    private int dateFlag;

    public int getUserId() {
        return userId;
    }

    public List<AmsAppMaster> getApplication() {
        return application;
    }

    public void setApplication(List<AmsAppMaster> application) {
        this.application = application;
    }

    public String getUserName() {
        return userName;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getDateFlag() {
        return dateFlag;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setDateFlag(int dateFlag) {
        this.dateFlag = dateFlag;
    }
}

