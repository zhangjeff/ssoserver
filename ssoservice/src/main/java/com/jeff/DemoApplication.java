package com.jeff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Youpeng.Zhang on 2018/8/17.
 */

@RestController
@SpringBootApplication //Spring Boot核心注解，用于开启自动配置
public class DemoApplication {

    @RequestMapping("/index")
    String index(){
        return "Hello Spring Boot111";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
