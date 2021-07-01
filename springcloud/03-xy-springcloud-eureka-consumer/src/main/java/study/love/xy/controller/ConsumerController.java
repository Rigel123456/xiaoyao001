package study.love.xy.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Author:  小楠学长
 * Company：无业游民
 * Date：   2021/6/25
 * Description：
 */
@RestController
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error" ,commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "5000")})
    @RequestMapping("betelgeuse.do")
    public String testConsumer(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://03-xy-springcloud-eureka-provider/xy.do", String.class);
        return  forEntity.getBody();

    }

    public String error(){

        return"对不起，我不爱你了";

    }
}
