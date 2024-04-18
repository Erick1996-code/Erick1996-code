package com.example.Loan_Litigation.UserManagement;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "User_Management")
@AllArgsConstructor
public class UserManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String postalAddress;
    private String postalCode;
    private String city;
    private String countryName;
    private String countryCode;
    private String loanAccountNumber;
    private String loanAmount;
    private LocalDateTime disbursementDate;
    private String monthlyInstallmentAmount;
    private String repaymentDuration;
    private String interestRate;
    private String repaymentStartDate;
    private String repaymentEndDate;
    private String firstMonthlyInstallmentAmount;
    private String lastMonthlyInstallmentAmount;
    private String firstNotificationReminderDate;
    private String firstMonthlyInstallmentAmountPaid;





}

