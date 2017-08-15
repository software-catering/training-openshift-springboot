package software.catering.training.openshiftspringboot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import software.catering.training.openshiftspringboot.util.HelloResponse;
import software.catering.training.openshiftspringboot.util.ServiceIdentificationUtil;
import software.catering.training.openshiftspringboot.util.WorldResponse;

import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class HelloService {

    @Value("${world-service.url}")
    private String helloServiceUrl;

    public static void main(String[] args) {
        SpringApplication.run(HelloService.class, args);
    }

    private final RestTemplate worldRestTemplate;

    @Autowired
    public HelloService(RestTemplateBuilder restTemplateBuilder) {
        this.worldRestTemplate = restTemplateBuilder.build();
    }

    @RequestMapping("/hello")
    public HelloResponse hello() throws UnknownHostException {

        WorldResponse worldResponse = callWorldService();
        String message = "hello " + ServiceIdentificationUtil.getServiceIdentification();
        return new HelloResponse(message, worldResponse);
    }


    private WorldResponse callWorldService() {
        return this.worldRestTemplate.getForObject(helloServiceUrl + "/world", WorldResponse.class);
    }

}



