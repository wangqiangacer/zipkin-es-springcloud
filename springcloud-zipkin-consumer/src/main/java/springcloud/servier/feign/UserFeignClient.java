package springcloud.servier.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "user-provider")
@Component
public interface UserFeignClient {
    @PostMapping("/user/getUser/{id}")
    String getUser(@PathVariable("id") Long id);

    class UserFeignClientHystrix implements  UserFeignClient{

        @Override
        public String getUser(Long id) {
            return "系统错误";
        }
    }
}
