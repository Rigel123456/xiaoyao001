package study.love.xy.contrller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:  小楠学长
 * Company：无业游民
 * Date：   2021/6/25
 * Description：
 */
@RestController
public class ProviderController {
    @RequestMapping("xy.do")
    public String testProvider(){
       // System.out.println(10/0);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "I can't leave you";
    }
}
