package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019-3-1 13:50
 * @Created by CrazyStone
 */

@RestController     //  该注解为组合注解，等同于Spring中@Controller+@ResponseBody注解
public class HelloController {
    @GetMapping("/hello")  // 该注解等同于Spring框架中@RequestMapping(RequestMethod.GET)注解
    public String hello(){
        return "hello Spring Boot";
    }
}

