package com.holddie.cloud.rpc.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello服务提供
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2017/11/30 11:09
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String index(@RequestParam String name){
        return "hello " + name + ",this is first message!";
    }
}
