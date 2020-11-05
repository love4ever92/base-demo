package org.zjh.better.demo.restful;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zjh.better.demo.rpc.Rpc;
import reactor.core.publisher.Mono;

/**
 * @author：zjh
 * @ClassName:
 * @Description:
 * @date：2020/11/4 11:06
 */


@SpringBootApplication
@RestController
@EnableDubbo
public class DemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Value("aa")
    private String aa;

    @Reference(async = true)
    private Rpc rpc;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // System.out.println(rpc.rpc());
    }


    @GetMapping(value = "/get")
    public Mono<String> getName(){
        System.out.println("aa");
        return Mono.fromFuture(rpc.rpc());
    }




}
