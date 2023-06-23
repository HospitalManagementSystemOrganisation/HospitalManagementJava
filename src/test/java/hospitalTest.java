import dto.Request;
import dto.Response;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import service.E_PatientService;
import service.PatientService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class hospitalTest {
    @Test
    private void patientCanRegister(){
        String successMessage =  "Successfully registered " + "benjamin@gmail.com";
        Request request = Request.builder()
                .email("benjamin@gmail.com")
                .password("Password1@")
                .build();
        PatientService patientService = new E_PatientService();
        Response response = patientService.registerNewPatient(request);
        assertEquals(response.getEmail() , request.getEmail());
        assertEquals(response.getMessage(), successMessage);

    }
}
