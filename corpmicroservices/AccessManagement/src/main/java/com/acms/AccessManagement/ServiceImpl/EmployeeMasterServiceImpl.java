package com.acms.AccessManagement.ServiceImpl;

import com.acms.AccessManagement.Entity.Employee;
import com.acms.AccessManagement.Repo.EmployeeMasterRepo;
import com.acms.AccessManagement.Service.EmployeeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeMasterServiceImpl implements EmployeeMasterService {

    @Autowired
    private EmployeeMasterRepo employeeMasterRepo;
    @Override
    public List<Employee> findAll() {
        return employeeMasterRepo.findAll();
    }
}
