//package com.example.Loan_Litigation.CaseManagement;
//
//import com.example.Loan_Litigation.Authentication.Responses.MessageResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public class CaseController {
//    @Autowired
//    private final CaseService caseService;
//    @PostMapping("/add")
//    public ResponseEntity<Object> addcase(@RequestBody  Case cases) {
//        try {
//            MessageResponse<?> savedParishes = caseService.addCase(cases);
//            return new ResponseEntity<>(savedParishes, HttpStatus.OK);
//        } catch (Exception e) {
//            log.info("Error" + e);
//            return null;
//        }
//    }
//}
