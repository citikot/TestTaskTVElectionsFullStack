package academy.tochkavhoda.elections.server;

import academy.tochkavhoda.elections.dto.request.RegisterVoterDTORequest;
import academy.tochkavhoda.elections.dto.response.RegisterVoterDTOResponse;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import java.io.Reader;

import static org.junit.jupiter.api.Assertions.*;

public class ServerTest {

    Server server = new Server();
    Gson gson = new Gson();

    @Test
    public void testValidVoterRegistration (){
        RegisterVoterDTORequest registerRequest = new RegisterVoterDTORequest("Alex", "Alex&12345", "Alex#12345");
        String jsonRegisterRequest = gson.toJson(registerRequest);
        ServerResponse serverRegisterResponse = server.register(jsonRegisterRequest);
        assertEquals(ResponseCode.RESPONSE_CODE_200, serverRegisterResponse.getResponseCode());
        RegisterVoterDTOResponse registerResponse = gson.fromJson((Reader) serverRegisterResponse.getResponseData(), RegisterVoterDTOResponse.class);
        // assert’ы для полей serverResponse
    }
}
