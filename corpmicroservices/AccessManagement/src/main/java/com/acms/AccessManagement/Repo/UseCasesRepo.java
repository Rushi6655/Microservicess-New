package com.acms.AccessManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acms.AccessManagement.Entity.UseCases;

@Repository
public interface UseCasesRepo extends JpaRepository<UseCases, Integer> {
	public UseCases findById(int Id);

}
