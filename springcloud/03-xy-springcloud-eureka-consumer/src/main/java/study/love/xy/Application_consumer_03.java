package study.love.xy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//激活hystix熔断机制
@EnableCircuitBreaker
public class Application_consumer_03 {

    public static void main(String[] args) {
        SpringApplication.run(Application_consumer_03.class, args);
    }

}
