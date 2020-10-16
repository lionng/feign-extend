package top.zhangxiaofeng.feigninheritapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "feign-inherit-provide")
public interface UserRemoteClient {
    @GetMapping("/user/name")
    String getName();
}
