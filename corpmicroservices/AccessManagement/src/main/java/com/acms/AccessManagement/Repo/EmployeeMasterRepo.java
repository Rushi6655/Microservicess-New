package com.acms.AccessManagement.Repo;

import com.acms.AccessManagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMasterRepo extends JpaRepository<Employee,Integer> {
    @Query(value = "SELECT Staff_ID,F_Name,L_Name FROM employee_master WHERE date_of_departure IS null ORDER BY F_Name;",nativeQuery = true)
    public List<Employee> findAll();
}
