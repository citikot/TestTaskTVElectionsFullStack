package academy.tochkavhoda.elections.server;

public class TestServer {
    @Test
    public void testRegisterVoter {
        Server server = new Server();
        String jsonRequest = “json-для-регистрации избирателя”;
        ServerResponse serverResponse  = server.register(jsonRequest);
        // assert’ы для полей serverResponse
    }
}
