package org.base.demo.restful;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.base.demo.vo.OrderVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.base.demo.dto.OrderDto;
import org.base.demo.rpc.UserOrderRpc;
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
public class UserApiApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Value("aa")
    private String aa;

    @Reference(async = true)
    private UserOrderRpc userOrderRpc;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }


    @PostMapping(value = "/getOrderDetail")
    public Mono<OrderVo> getOrderDetail(OrderDto orderDto){
        System.out.println("getOrderDetail");
        return Mono.fromFuture(userOrderRpc.getOrderDetail(orderDto));
    }




}
