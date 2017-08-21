package software.catering.training.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class HelloService {

    public static void main(String[] args) {
        SpringApplication.run(HelloService.class, args);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public HelloResponse hello() throws UnknownHostException {

        String message = "hello";
        return new HelloResponse(message);
    }
}

