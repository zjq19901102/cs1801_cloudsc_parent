package com.qf.cloudsc.user.service.impl;

import com.qf.cloudsc.user.Users;
import com.qf.cloudsc.user.UsesService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class UserServiceImpl implements UsesService {

    @Value("${server.port}")
    private String port;

    @Override
    public Users findUsersById(@PathVariable("uid")Long uid) {
        // TODO Auto-generated method stub
        System.out.println("uid:" +uid);
        System.out.println("==========="+port);
        return new Users(uid, "zoukx--"+port);
    }

    @Override
    public void addUser(@RequestBody Users users) {
        // TODO Auto-generated method stub
        System.out.println(users);

    }
}
