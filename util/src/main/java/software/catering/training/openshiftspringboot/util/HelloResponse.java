package software.catering.training.openshiftspringboot.util;

import java.util.Date;

public class HelloResponse {
    public String message;
    public WorldResponse worldResponse;
    public String senderIp = ServiceIdentificationUtil.getServiceIdentification();
    public String timeStamp = new Date().toString();

    HelloResponse() {
    }

    public HelloResponse(String message, WorldResponse worldResponse) {
        this.message = message;
        this.worldResponse = worldResponse;
    }
}
