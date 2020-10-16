package top.zhangxiaofeng.feigninheritconsume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhangxiaofeng.feigninheritapi.client.UserRemoteClient;

@RestController
public class DemoController {
    @Autowired
    private UserRemoteClient userRemoteClient;
    @GetMapping("/call")
    public String callHello() {
        String result = userRemoteClient.getName();
        System.out.println("getName调用结果：" + result);
        return result;
    }
}
