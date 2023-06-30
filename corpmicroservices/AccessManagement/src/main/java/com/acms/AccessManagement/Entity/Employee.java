package com.acms.AccessManagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_master")
public class Employee {
    @Id
    @Column(name = "staff_id")
    private int empId;
    @Column(name = "F_Name")
    private String fname;
    @Column(name = "L_Name")
    private String lname;

    public int getEmpId() {
        return empId;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
