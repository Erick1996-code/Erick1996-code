package com.example.Loan_Litigation.Authentication.Requests;

import lombok.Data;



@Data
public class UserDTO {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;

}
