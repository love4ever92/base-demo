package org.base.demo.restful;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：zjh
 * @ClassName:
 * @Description:
 * @date：2020/11/4 11:06
 */


@SpringBootApplication
@RestController
@EnableDubbo
public class ApiUserApplication  {

    public static void main(String[] args) {
        SpringApplication.run(ApiUserApplication.class, args);
    }


}
