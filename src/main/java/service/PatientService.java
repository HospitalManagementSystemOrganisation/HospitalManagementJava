package service;

import dto.Request;
import dto.Response;

public interface PatientService {
    Response registerNewPatient(Request request);
}
