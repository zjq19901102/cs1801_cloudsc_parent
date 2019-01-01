package com.qf.cloudsc.user.web.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.qf.cloudsc.user.Users;
import com.qf.cloudsc.user.web.common.AppResult;
import com.qf.cloudsc.user.web.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@DefaultProperties(defaultFallback = "findUsersByidFallBack")
public class UserController {
    @Autowired
    private UserServiceFeign userServiceFeign;
    @RequestMapping(value="/find/{uid}",method= RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "15000"),
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "40")
    })
    public AppResult findUsersByid(@PathVariable("uid") Long uid){
        if(uid%2==0){
            throw new RuntimeException("test");
        }
        return new AppResult(true,"服务成功",200,userServiceFeign.findUsersById(uid));
    }


    public AppResult findUsersByidFallBack(){
        return new AppResult(true,"服务降级了",201,null);
    }
}
