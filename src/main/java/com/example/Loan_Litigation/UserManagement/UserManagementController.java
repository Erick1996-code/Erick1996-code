package com.example.Loan_Litigation.UserManagement;//package com.example.Loan_Litigation.UserManagement;

import com.example.Loan_Litigation.Authentication.Responses.EntityResponse;
import com.example.Loan_Litigation.Authentication.Users.UsersService;
import com.example.Loan_Litigation.UserManagement.UserManagement;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")

public class UserManagementController {

    @Autowired
    UserManagementService userManagementService;

    //    @PostMapping("/register")
//    public EntityResponse register(@RequestBody UserManagement userManagement) {
//        return userManagementService.register(userManagement);
//    }
    @PostMapping("/register")
    public EntityResponse register(@RequestBody UserManagement userManagement){
        return userManagementService.register(userManagement);
    }

    @PutMapping("/update")
    public EntityResponse update(@org.springframework.web.bind.annotation.RequestBody UserManagement userManagement){
        return userManagementService.update(userManagement);
    }

    @GetMapping("/read")
    public EntityResponse read(@RequestParam Long id){
        return userManagementService.read(id);
    }

    @DeleteMapping("/delete")
    public EntityResponse delete(@RequestParam Long id){
        return userManagementService.read(id);
    }


}

