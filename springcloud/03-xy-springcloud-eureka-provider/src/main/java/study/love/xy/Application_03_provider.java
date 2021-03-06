package study.love.xy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Application_03_provider {

    public static void main(String[] args) {
        SpringApplication.run(Application_03_provider.class, args);
    }

}
