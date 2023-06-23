package service;

import dto.Request;
import dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PatientRepository;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class E_PatientService implements PatientService{
    @Autowired
    PatientRepository patientRepository;
    @Override
    public Response registerNewPatient(Request request) {
        boolean isValidEmail = validateEmail(request.getEmail());
        boolean isValidPassword = validatePassword(request.getPassword());
        Response response = null;
        if(isValidEmail && isValidPassword){
        return Response.builder()
                .email(request.getEmail())
                .message("Successfully registered "+ request.getEmail())
                .build();

        }else if(!isValidEmail )

             response = Response.builder()
                    .message("""
                     invalid email
                    """)
                    .build();
        else if (!isValidPassword)
            response = Response.builder()
                    .message("""
                    Password does not match. The password should 
                    be at least 8 characters long, with at least one number, 
                    one capital letter 
                    """)
                    .build();
        return  response;
    }
    private boolean validatePassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%<>,?/]).{8,32}$";
        Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    private boolean validateEmail(String email) {
        Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher m = p.matcher(email);


        return m.matches();
    }



}
