package com.qf.cloudsc.user.web.feign;

import com.qf.cloudsc.user.UsesService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// 1 写一个接口 继承  提供者中的接口
// 2 @FeignClient 中写的 是提供者在eureka 中注册的名字()
@FeignClient("service-user")
public interface UserServiceFeign extends UsesService{

}
