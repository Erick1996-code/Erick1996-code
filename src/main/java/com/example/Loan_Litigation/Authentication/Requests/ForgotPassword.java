package com.example.Loan_Litigation.Authentication.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ForgotPassword {
    private  String emailAddress;
}
