package org.base.demo.restful;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class DriverApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriverApiApplication.class, args);
    }



}
