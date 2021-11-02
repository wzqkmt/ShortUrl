package com.example.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello IDEA";
    }

    @RequestMapping("/getmap")
    public Map<String,Object> getmap(){
        Map<String,Object> m = new HashMap();
        m.put("status",200);
        m.put("message","success");
        m.put("data","Hello Assignment");
        return m;
    }
}
