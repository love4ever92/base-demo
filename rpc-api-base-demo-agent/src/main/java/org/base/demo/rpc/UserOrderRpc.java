package org.base.demo.rpc;

import org.base.demo.dto.OrderDto;
import org.base.demo.vo.OrderVo;

import java.util.concurrent.CompletableFuture;

public interface UserOrderRpc {

    public CompletableFuture<OrderVo> getOrderDetail(OrderDto orderDto);
}
