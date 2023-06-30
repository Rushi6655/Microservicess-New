package com.acms.AccessManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "use_cases")
@Data
@Getter
@Setter
@NoArgsConstructor
public class UseCases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "use_case_id")
    private int useCaseId;
    @Column(name = "project_id")
    private int projectId;
    @Column(name = "use_case_name")
    private String useCaseName;
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
