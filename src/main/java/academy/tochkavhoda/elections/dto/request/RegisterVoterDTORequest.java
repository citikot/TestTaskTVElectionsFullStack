package academy.tochkavhoda.elections.dto.request;

import com.google.gson.Gson;

public class RegisterVoterDTORequest {

    private String name;
    private String login;
    private String password;
    Gson json = new Gson();
    // конструкторы, геттеры и сеттеры

    public RegisterVoterDTORequest(String jsonString){
        RegisterVoterDTORequest registerVoterDtoRequest = json.fromJson(jsonString, RegisterVoterDTORequest.class);
        if (registerVoterDtoRequest.validate()){

        }
    }

    private boolean validate(){
        return true;
    }
}
