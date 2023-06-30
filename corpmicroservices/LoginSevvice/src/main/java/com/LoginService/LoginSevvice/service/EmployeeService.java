package com.LoginService.LoginSevvice.service;

import com.LoginService.LoginSevvice.entity.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(String id,String pass);
	public Employee getEmployeeByUserId(int id);
}
