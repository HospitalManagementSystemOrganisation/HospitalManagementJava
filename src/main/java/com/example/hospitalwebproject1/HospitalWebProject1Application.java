package com.example.hospitalwebproject1;

import controller.E_PatientController;
import controller.PatientController;
import dto.Request;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalWebProject1Application {
//   static PatientController patientController = new E_PatientController();
    public static void main(String[] args){
        SpringApplication.run(HospitalWebProject1Application.class, args);

//        System.out.println(patientController.registerNewPatient(Request.builder()
//                .email("email@gmail.com")
//                .password("Benjamin12.COM")
//                .build()));
    }

}
