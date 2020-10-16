package top.zhangxiaofeng.feigninheritapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "top.zhangxiaofeng.feigninheritapi.client")
public class FeignInheritApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignInheritApiApplication.class, args);
    }

}
