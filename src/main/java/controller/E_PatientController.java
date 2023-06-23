package controller;

import dto.Request;
import dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.E_PatientService;
import service.PatientService;

@RestController
@RequestMapping("/patient")
public class E_PatientController implements PatientController {
//    @Autowired
    PatientService patientService = new E_PatientService();

    @PostMapping("/registration")
    public Response registerNewPatient(@RequestBody Request request){
        return  patientService.registerNewPatient(request);
    }
}
