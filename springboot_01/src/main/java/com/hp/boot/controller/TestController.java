package com.hp.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/test",tags = "测试接口")
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "sayHello",notes = "测试用例，返回一个String")
    @GetMapping("/hello.action")
    public String sayHello(@RequestParam(value = "name") String name){
        System.out.println("hello"+name);
        return "hello"+name;
    }

    @ApiOperation(value = "sayHello2",notes = "测试用例2，返回一个String")
    @GetMapping("/hello2.action")
    public String sayHello2(@RequestParam(value = "name") String name){
        System.out.println("hello2"+name);
        return "hello2"+name;
    }
}
