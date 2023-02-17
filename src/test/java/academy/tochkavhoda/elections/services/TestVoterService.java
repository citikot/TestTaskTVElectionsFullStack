package academy.tochkavhoda.elections.services;

import academy.tochkavhoda.elections.server.Server;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestVoterService {

    Server server;

    @BeforeAll
    public static void ServerStart(){
        Server server = new Server();
    }

    @Test
    public void testCorrectVoterRegistration() {
        String jsonRequest = "{'name': name, 'login': login, 'password': password}";
        ServerResponse serverResponse  = server.register(jsonRequest);
        voterService.register(gson.toJson(jsonString))
        // assert’ы для полей serverResponse
    }
}
