package springcloud.server.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser/{id}")
    public  String  getUser(@PathVariable("id")Long id){
        return  "***分布式链路追踪系统***"+id;
    }
}
