package controller;

import dto.Request;
import dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.E_PatientService;
import service.PatientService;

@RestController
//@RequestMapping("/patient")
public class E_PatientController{
//    @Autowired
    PatientService patientService = new E_PatientService();

    @GetMapping("/registration")
    public Response registerNewPatient(@RequestBody Request request){
        return  patientService.registerNewPatient(request);
    }
}
