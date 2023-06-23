package service;

import dto.Request;
import dto.Response;
import org.springframework.stereotype.Service;

@Service
public class E_PatientService implements PatientService{
    @Override
    public Response registerNewPatient(Request request) {
        boolean isValidEmail = validateEmail(request.getEmail());
        boolean isValidPassword = validatePassword(request.getPassword());
        Response response = null ;
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

    private boolean validateEmail(String email) {

        return false;
    }

    private boolean validatePassword(String password) {
        return false;
    }
}
