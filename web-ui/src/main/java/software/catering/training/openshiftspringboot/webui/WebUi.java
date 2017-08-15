package software.catering.training.openshiftspringboot.webui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class WebUi {

    public static void main(String[] args) {
        SpringApplication.run(WebUi.class, args);
    }
}