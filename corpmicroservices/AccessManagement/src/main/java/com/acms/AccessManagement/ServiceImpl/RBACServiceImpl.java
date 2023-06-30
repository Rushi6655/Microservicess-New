package com.acms.AccessManagement.ServiceImpl;

import com.acms.AccessManagement.Entity.RBAC;
import com.acms.AccessManagement.Repo.RBACRepo;
import com.acms.AccessManagement.Service.RBACService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RBACServiceImpl implements RBACService {
    @Autowired
    RBACRepo repo;
    @Override
    public RBAC getRbacById(int id) {
        return repo.findById(id);
    }
}
