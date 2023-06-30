package com.acms.AccessManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rbac_master")
@Getter
@Setter
@NoArgsConstructor
@Data
public class RBAC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rbac_id")
    private int rbacId;
    @JoinColumn(name = "role_id")
    @ManyToOne
    private RoleMaster role;
    @JoinColumn(name = "use_case_id")
    @ManyToOne
    private UseCases useCase;
    @Column(name = "read_access")
    private String readAccess;
    @Column(name = "write_access")
    private String writeAccess;

    @Column(name = "edit_access")
    private String editAccess;
    @Column(name = "delete_access")
    private String deleteAccess;
    @Column(name = "created_by")
    private int createdBy;
    @Column(name = "created_date")
    private String cretedDate;
    @Column(name = "updated_by")
    private int updatedBy;
    @Column(name = "updated_date")
    private String updateDate;
    @Column(name = "deleted_by")
    private int deletedBy;
    @Column(name = "deleted_date")
    private String deletedDate;
}
