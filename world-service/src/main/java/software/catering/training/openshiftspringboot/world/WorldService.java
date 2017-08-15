package software.catering.training.openshiftspringboot.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.catering.training.openshiftspringboot.util.ServiceIdentificationUtil;
import software.catering.training.openshiftspringboot.util.WorldResponse;

import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class WorldService {

    public static void main(String[] args) {
        SpringApplication.run(WorldService.class, args);
    }

    @RequestMapping("/world")
    public WorldResponse world() throws UnknownHostException {
        return new WorldResponse("world  " + ServiceIdentificationUtil.getServiceIdentification());
    }
}



