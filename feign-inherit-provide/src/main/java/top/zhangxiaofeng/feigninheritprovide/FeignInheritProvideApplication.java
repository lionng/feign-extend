package top.zhangxiaofeng.feigninheritprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class FeignInheritProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignInheritProvideApplication.class, args);
    }

}
