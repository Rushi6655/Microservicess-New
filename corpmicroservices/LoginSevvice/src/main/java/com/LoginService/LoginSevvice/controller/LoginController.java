package com.LoginService.LoginSevvice.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.LoginService.LoginSevvice.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.LoginService.LoginSevvice.dto.LoginObj;
import com.LoginService.LoginSevvice.entity.Employee;
import com.LoginService.LoginSevvice.serviceImpl.EmployeeServiceImpl;


@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired 
	EmployeeServiceImpl serviceImpl;
	@PostMapping("/isUserValid")
	public ResponseEntity<Map<String,Object>> getEmployeeById(@RequestBody LoginObj obj) {
		Map<String,Object> result=new HashMap<>();
		Employee employee= serviceImpl.getEmployeeById(obj.getUserId(),obj.getPassword());
		if(employee!=null){
			result.put("data",employee);
			result.put("status","Found");
		}else{
			result.put("data",new Employee());
			result.put("status","Not Found");
		}

		return new ResponseEntity<>(result, HttpStatus.FOUND);
	}
	@GetMapping("/demo")
	public String demo() {
		String st="hellow";
		return "Hello User";
	}
	@GetMapping("/{userId}")
	public Employee getUserRoleList(@PathVariable("userId") int userId){
		return serviceImpl.getEmployeeByUserId(userId);
	}

}
