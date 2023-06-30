package com.acms.AccessManagement.Dto;


import java.time.LocalDateTime;
import java.util.List;

public class AmsAppMaster {

    private int appId;
    private String appName;
    private int createdBy;
    private LocalDateTime createdDate;
    private int updatedBy;
    private LocalDateTime updatedDate;
    private int deletedBy;
    private LocalDateTime deletedDate;

    private List<AmsAppModule> modules;


    public AmsAppMaster() {
        super();
    }
    public int getAppId() {
        return appId;
    }
    public void setAppId(int app_id) {
        this.appId = app_id;
    }
    public String getAppName() {
        return appName;
    }
    public void setAppName(String app_name) {
        this.appName = app_name;
    }
    public int getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(int created_by) {
        this.createdBy = created_by;
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(LocalDateTime created_date) {
        this.createdDate = created_date;
    }
    public int getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(int updated_by) {
        this.updatedBy = updated_by;
    }
    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }
    public void setUpdatedDate(LocalDateTime updated_date) {
        this.updatedDate = updated_date;
    }
    public int getDeletedBy() {
        return deletedBy;
    }
    public void setDeletedBy(int deleted_by) {
        this.deletedBy = deleted_by;
    }

    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDateTime deleted_date) {
        this.deletedDate = deleted_date;
    }
    public List<AmsAppModule> getModules() {
        return modules;
    }
    public void setModules(List<AmsAppModule> modules) {
        this.modules = modules;
    }
}
