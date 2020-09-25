package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    /**作用：将方法的返回值，以特定的格式写入到response的body区域，进而将数据返回给客户端。
    当方法上面没有写ResponseBody,底层会将方法的返回值封装为ModelAndView对象。
    如果返回值是字符串，那么直接将字符串写到客户端；如果是一个对象，会将对象转化为json串，然后写到客户端。*/
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
