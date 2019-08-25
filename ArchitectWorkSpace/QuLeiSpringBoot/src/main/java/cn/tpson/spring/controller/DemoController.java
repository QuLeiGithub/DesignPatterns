package cn.tpson.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        System.out.println("Spring boot");
        return "Hello SpringBoot";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
