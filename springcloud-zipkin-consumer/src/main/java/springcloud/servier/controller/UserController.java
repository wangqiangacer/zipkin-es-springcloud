package springcloud.servier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.servier.feign.UserFeignClient;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;
    @RequestMapping("/getUser/{id}")
    public  String getUser(@PathVariable("id") Long  id){
     return    userFeignClient.getUser(id);
    }
}
