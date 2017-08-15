package software.catering.training.openshiftspringboot.util;

public class WorldResponse {
    public String message;
    public String senderIp = ServiceIdentificationUtil.getServiceIdentification();

    WorldResponse() {
    }

    public WorldResponse(String message) {
        this.message = message;
    }
}
