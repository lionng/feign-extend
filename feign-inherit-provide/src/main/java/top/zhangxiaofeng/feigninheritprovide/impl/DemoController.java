package top.zhangxiaofeng.feigninheritprovide.impl;

import org.springframework.web.bind.annotation.RestController;
import top.zhangxiaofeng.feigninheritapi.client.UserRemoteClient;

@RestController
public class DemoController implements UserRemoteClient {
    @Override
    public String getName() {
        return "zhangsan";
    }
}
