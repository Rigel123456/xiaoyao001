package study.love.xy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application_eureka_03 {

    public static void main(String[] args) {
        SpringApplication.run(Application_eureka_03.class, args);
    }

}
