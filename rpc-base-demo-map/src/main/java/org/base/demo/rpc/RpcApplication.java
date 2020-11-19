package org.base.demo.rpc;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author：zjh
 * @ClassName:
 * @Description:
 * @date：2020/11/4 17:17
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = {"org.base.demo.demo.rpc.service"})
@MapperScan("org.base.demo.demo.mapper")
public class RpcApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcApplication.class, args);
    }


}
