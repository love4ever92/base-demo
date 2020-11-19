package org.base.demo.rpc.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.base.demo.dto.OrderDto;
import org.base.demo.rpc.UserOrderRpc;
import org.base.demo.vo.OrderVo;
import org.base.sur.service.UserOrderService;

import java.util.concurrent.CompletableFuture;

@Service
public class UserOrderRpcImpl extends BaseRpc implements UserOrderRpc {

    @Autowired
    private UserOrderService userOrderService;


    public CompletableFuture<OrderVo> getOrderDetail(OrderDto orderDto){
        return this.buildFuture(userOrderService.getOrderDetail(orderDto));
    }
}
