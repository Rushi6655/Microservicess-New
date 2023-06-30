package com.LoginService.LoginSevvice.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginService.LoginSevvice.entity.Employee;
import com.LoginService.LoginSevvice.repo.EmployeeRepo;
import com.LoginService.LoginSevvice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepo repo;

	

	@Override
	public Employee getEmployeeById(String id, String pass) {
		return repo.isUserValid(id,pass);
	}

	@Override
	public Employee getEmployeeByUserId(int id) {
		return repo.findById(id);
	}

}
