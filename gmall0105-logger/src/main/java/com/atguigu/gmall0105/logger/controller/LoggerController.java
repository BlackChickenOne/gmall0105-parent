package com.atguigu.gmall0105.logger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
//@RestController //@RestController = @Controller + @ResponseBody
@ResponseBody
public class LoggerController {
    //@ResponseBody 决定方法的返回值是网页还是文本

    @RequestMapping("/applog")
    public String log(@RequestBody String log){
        System.out.println(log);
        return log;
    }

}
