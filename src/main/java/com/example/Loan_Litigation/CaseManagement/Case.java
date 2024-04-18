//package com.example.Loan_Litigation.CaseManagement;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//import javax.persistence.*;
//import java.util.Date;
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@ToString
//@Entity
//@Table(name = "cases")
//public class Case {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "case_category")
//    private String caseCategory;
//
//    private String priority;
//
//    private String assignee;
//
//    private String description;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "created_at")
//    private Date createdAt;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "updated_at")
//    private Date updatedAt;
//
//    private String status; // Status of the case (e.g., open, closed)
//
//    // Constructors, getters, and setters
//}
//
