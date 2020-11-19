package org.base.sur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.base.demo.dto.OrderDto;
import org.base.demo.entity.Order;
import org.base.demo.entity.User;
import org.base.demo.service.OrderService;
import org.base.demo.service.UserService;
import org.base.demo.vo.OrderVo;

@Service
public class UserOrderService {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    public OrderVo getOrderDetail(OrderDto orderDto){

        Order order = orderService.getById(orderDto.getId());

        User user = userService.getById(order.getUserId());

        OrderVo orderVo = new OrderVo();

        orderVo.setId(order.getId());
        orderVo.setUserId(order.getUserId());
        orderVo.setMoney(order.getMoney());
        orderVo.setUserName(user.getUserName());

        return orderVo;


    }

}
