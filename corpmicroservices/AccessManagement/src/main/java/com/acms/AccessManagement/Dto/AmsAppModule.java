package com.acms.AccessManagement.Dto;


import java.time.LocalDateTime;

public class AmsAppModule {

    private int appModuleId;
    private int appId;
    private String appName;

    private String appModuleName;
    private int createdBy;
    private LocalDateTime createdDate;
    private int updatedBy;
    private LocalDateTime updatedDate;
    private int deletedBy;
    private LocalDateTime deletedDate;

    private String readAccess;
    private String writeAccess;
    private String editAccess;
    private String deleteAccess;



    public String getAppName() {
        return appName;
    }
    public void setAppName(String app_name) {
        this.appName = app_name;
    }

    public int getAppModuleId() {
        return appModuleId;
    }
    public void setAppModuleId(int app_module_id) {
        this.appModuleId = app_module_id;
    }
    public int getAppId() {
        return appId;
    }
    public void setAppId(int app_id) {
        this.appId = app_id;
    }
    public String getAppModuleName() {
        return appModuleName;
    }
    public void setAppModuleName(String app_module_name) {
        this.appModuleName = app_module_name;
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
    public String getReadAccess() {
        return readAccess;
    }
    public void setReadAccess(String readAccess) {
        this.readAccess = readAccess;
    }
    public String getWriteAccess() {
        return writeAccess;
    }
    public void setWriteAccess(String writeAccess) {
        this.writeAccess = writeAccess;
    }
    public String getEditAccess() {
        return editAccess;
    }
    public void setEditAccess(String editAccess) {
        this.editAccess = editAccess;
    }
    public String getDeleteAccess() {
        return deleteAccess;
    }
    public void setDeleteAccess(String deleteAccess) {
        this.deleteAccess = deleteAccess;
    }
}

