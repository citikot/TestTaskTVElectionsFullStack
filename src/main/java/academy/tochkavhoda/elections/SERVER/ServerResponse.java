package academy.tochkavhoda.elections.SERVER;

public class ServerResponse {
    private ResponseCode responseCode;
    private String responseData;

    public ServerResponse(ResponseCode responseCode, String responseData) {
        this.responseCode = responseCode;
        this.responseData = responseData;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }
}
