package academy.tochkavhoda.elections.server;

import java.util.Map;

public class ServerResponse {
    private ResponseCode responseCode;
    private Map<String, String> responseData;

    public ServerResponse(ResponseCode responseCode,  Map<String, String>  responseData) {
        this.responseCode = responseCode;
        this.responseData = responseData;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public  Map<String, String>  getResponseData() {
        return responseData;
    }

    public void setResponseData( Map<String, String>  responseData) {
        this.responseData = responseData;
    }
}
