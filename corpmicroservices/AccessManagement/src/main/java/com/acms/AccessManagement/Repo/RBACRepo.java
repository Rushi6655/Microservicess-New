package com.acms.AccessManagement.Repo;

import com.acms.AccessManagement.Entity.RBAC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RBACRepo extends JpaRepository<RBAC,Integer> {
    public RBAC findById(int id);
}
