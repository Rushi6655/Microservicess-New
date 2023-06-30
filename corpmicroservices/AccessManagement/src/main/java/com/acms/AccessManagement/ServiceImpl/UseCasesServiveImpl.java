package com.acms.AccessManagement.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acms.AccessManagement.Entity.UseCases;
import com.acms.AccessManagement.Repo.UseCasesRepo;
import com.acms.AccessManagement.Service.UsecasesService;

@Service
public class UseCasesServiveImpl implements UsecasesService {
     @Autowired
     UseCasesRepo useCasesRepo ;
	@Override
	public UseCases findbyUseCases(int Id) {
		
		return useCasesRepo.findById(Id);
	}
	

}
