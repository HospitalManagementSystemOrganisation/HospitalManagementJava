package controller;

import dto.Request;
import dto.Response;
import org.springframework.web.bind.annotation.RequestBody;

public interface PatientController {
    public Response registerNewPatient(@RequestBody Request request);
}
