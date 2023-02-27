package academy.tochkavhoda.elections.server;

import academy.tochkavhoda.elections.database.Database;
import academy.tochkavhoda.elections.services.VoterService;
import com.google.gson.Gson;

public class Server {

    Database database = new Database();
    VoterService voterService = new VoterService();
    Gson gson = new Gson();

    // public ServerResponse methodName(String token, String requestJsonString)

    public ServerResponse register(String jsonString) {
        return voterService.register(gson.toJson(jsonString));
    }

    public ServerResponse login(String jsonString) {
        return voterService.login(gson.toJson(jsonString));
    }

    public ServerResponse logout(String jsonString) {
        return voterService.logout(gson.toJson(jsonString));
    }
}
