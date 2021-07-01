package study.love.xy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:  小楠学长
 * Company：无业游民
 * Date：   2021/6/23
 * Description：
 */
@RestController
public class TestController {
    @RequestMapping("xy.do")
    public String test(){
        return "hahaha";
    }
}
