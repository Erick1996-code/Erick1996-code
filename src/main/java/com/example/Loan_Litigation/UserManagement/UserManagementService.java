package com.example.Loan_Litigation.UserManagement;
import com.example.Loan_Litigation.Authentication.Responses.EntityResponse;
import com.example.Loan_Litigation.Authentication.Users.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Optional;

@Slf4j
@Service
public class UserManagementService {
    @Autowired
    UserManagementRepository userManagementRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public EntityResponse register(UserManagement userManagement){
        EntityResponse entityResponse = new EntityResponse<>();
        try{
            UserManagement savedUser = userManagementRepository.save(userManagement);
            entityResponse.setEntity(savedUser);
            entityResponse.setStatusCode(HttpStatus.CREATED.value());
            entityResponse.setMessage("User registered successfully");
        } catch (Exception e){
            log.error("Error occurred during registration: {}", e.getMessage());
        } return entityResponse;

    }


//    public EntityResponse register(UserManagement userManagement) {
//        EntityResponse entityResponse = new EntityResponse();
//        try {
//            UserManagement savedUserManagement = userManagementRepository.save(userManagement);
//            entityResponse.setMessage("User added successfully");
//            entityResponse.setEntity(savedUserManagement);
//            entityResponse.setStatusCode(HttpStatus.CREATED.value());
//        } catch (Exception e) {
//            entityResponse.setMessage("Failed to register user");
//            entityResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
//        }
//        return entityResponse;
//    }


    public EntityResponse update(UserManagement userManagement) {
        EntityResponse entityResponse = new EntityResponse<>();
        Optional<UserManagement> existingUser = userManagementRepository.findById(userManagement.getId());
        try {
            if (existingUser.isPresent()) {
                UserManagement userManagement1 = existingUser.get();
                userManagement1.setEmailAddress(userManagement1.getEmailAddress());
                userManagement1.setPhoneNumber(userManagement1.getPhoneNumber());
                userManagement1.setPostalAddress(userManagement1.getPostalAddress());
                userManagement1.setCity(userManagement.getCity());
                userManagement1.setMonthlyInstallmentAmount(userManagement.getMonthlyInstallmentAmount());
                userManagement1.setFirstMonthlyInstallmentAmountPaid(userManagement.getFirstMonthlyInstallmentAmountPaid());
                userManagement1.setLastMonthlyInstallmentAmount(userManagement.getLastMonthlyInstallmentAmount());
                userManagement1.setRepaymentStartDate(userManagement.getRepaymentStartDate());
                userManagement1.setFirstNotificationReminderDate(userManagement.getFirstNotificationReminderDate());
                userManagement1.setMonthlyInstallmentAmount(userManagement.getMonthlyInstallmentAmount());
                userManagement1.setFirstMonthlyInstallmentAmount(userManagement.getFirstMonthlyInstallmentAmount());
                userManagement1.setRepaymentStartDate(userManagement.getRepaymentStartDate());
                userManagement1.setInterestRate(userManagement.getInterestRate());
                userManagement1.setDisbursementDate(userManagement.getDisbursementDate());
                userManagement1.setFirstName(userManagement.getFirstName());
                userManagement1.setLastName(userManagement.getLastName());
                userManagement1.setId(userManagement1.getId());
                userManagementRepository.save(userManagement1);
                entityResponse.setMessage("user updated successfully");
                entityResponse.setStatusCode(HttpStatus.OK.value());
                entityResponse.setEntity(userManagement);

            } else {
                entityResponse.setMessage("user id not found");
                entityResponse.setStatusCode(HttpStatus.NO_CONTENT.value());
                entityResponse.setEntity(null);
            }
        } catch (Exception e) {
            entityResponse.setMessage("An error has occurred ");
            entityResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            entityResponse.setEntity("");

        }
        return entityResponse;
    }

    public EntityResponse read(Long id) {
        EntityResponse entityResponse = new EntityResponse<>();
        Optional<UserManagement> userManagementOptional = userManagementRepository.findById(id);
        try {
            if (userManagementOptional.isPresent()) {

                entityResponse.setMessage("case retrieved successfully");
                entityResponse.setStatusCode(HttpStatus.FOUND.value());
                entityResponse.setEntity("userManagementOptional");

            } else {
                entityResponse.setMessage("case NOT found");
                entityResponse.setStatusCode(HttpStatus.NO_CONTENT.value());
                entityResponse.setEntity(null);

            }
        } catch (Exception e) {
            log.error("Error{}", e);
        }
        return entityResponse;

    }

    public EntityResponse delete(Long id) {
        EntityResponse entityResponse = new EntityResponse<>();
        Optional<UserManagement> userManagementOptional = userManagementRepository.findById(id);
        try {
            if (userManagementOptional.isPresent()) {
                userManagementRepository.deleteById(id);
                entityResponse.setMessage("user deleted successfully");
                entityResponse.setStatusCode(HttpStatus.NO_CONTENT.value());
                entityResponse.setEntity(null);
            }
        } catch (Exception e) {
            log.error("Error occurred", e);
        }
        return entityResponse;
    }
}

