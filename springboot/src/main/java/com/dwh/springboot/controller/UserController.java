package com.dwh.springboot.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("myService/test")
public class UserController {

    @RequestMapping("/test")
    public String UserTest(){
        Map<String,Object> map = new HashMap<>();
        map.put("data", "hello word");
        map.put("code", 0);
        System.out.println("调用成功");
        return JSON.toJSONString(map);
    }

}
