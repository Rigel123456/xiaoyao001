package study.love.xy.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Author:  小楠学长
 * Company：无业游民
 * Date：   2021/6/23
 * Description：
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced //注解用于标记当前RestTemplate使用Ribbon的负载均衡，当时用了Eureka注册中心必须使用该注解，否则无法正常获取服务，默认ribbon负载均衡是轮询的
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
