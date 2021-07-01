package study.love.xy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import study.love.xy.config.RestTemplateConfig;

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

    @RequestMapping("xx.do")
    public String test() {

        //RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8081/xy.do", String.class);
        return forEntity.getBody();

    }
}
