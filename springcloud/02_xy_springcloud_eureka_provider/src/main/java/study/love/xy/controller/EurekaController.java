package study.love.xy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:  小楠学长
 * Company：无业游民
 * Date：   2021/6/24
 * Description：
 */
@RestController
public class EurekaController {
    @RequestMapping("zlj.do")
    public String test(){
        return "I love you";
    }

}
