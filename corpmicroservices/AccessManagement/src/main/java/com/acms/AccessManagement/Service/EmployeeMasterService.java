package com.acms.AccessManagement.Service;

import com.acms.AccessManagement.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeMasterService {
    public List<Employee> findAll();
}
