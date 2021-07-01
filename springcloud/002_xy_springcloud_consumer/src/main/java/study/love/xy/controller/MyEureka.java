package study.love.xy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Author:  小楠学长
 * Company：无业游民
 * Date：   2021/6/24
 * Description：
 */
@RestController
public class MyEureka {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("haolei.do")
    public String consumerTest() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("", String.class);
        return forEntity.getBody();
    }

}

