package com.qf.cloudsc.user;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/user")
public interface UsesService {

    //1 根据id 插叙   /user/find/1
    @RequestMapping(value="/find/{uid}",method= RequestMethod.GET)
    Users findUsersById(@PathVariable("uid") Long uid);
    //2 添加一个user   /user/add
    @RequestMapping(value="/add",method=RequestMethod.POST)
    void addUser(@RequestBody Users users);
}
