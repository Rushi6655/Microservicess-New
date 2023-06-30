package com.LoginService.LoginSevvice.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.LoginService.LoginSevvice.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query( value = "select * from employee_master where User_ID=(:id) AND Password= SHA1((:pass));",nativeQuery = true)
	public Employee isUserValid(@Param("id") String id,@Param("pass") String pass);
	public Employee findById(int id);

}
