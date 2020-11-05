package org.zjh.better.demo.rpc;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.logging.LoggingSystem;

/**
 * @author：zjh
 * @ClassName:
 * @Description:
 * @date：2020/11/4 17:17
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = {"org.zjh.better.demo.rpc.service"})
public class RpcApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcApplication.class, args);
    }


}
