package software.catering.training.hello;

import java.util.Date;

public class HelloResponse {
    public String message;
    public String senderIp = ServiceIdentificationUtil.getServiceIdentification();
    public String timeStamp = new Date().toString();

    HelloResponse() {
    }

    public HelloResponse(String message) {
        this.message = message;
    }
}

