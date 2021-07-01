package study.love.xy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Author:  小楠学长
 * Company：无业游民
 * Date：   2021/6/23
 * Description：
 */
@RestController
public class TestController {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("haolei.do")
    public String test() {

        //RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://02-xy-springcloud-eureka-provider/zlj.do", String.class);
        return forEntity.getBody();

    }
}
