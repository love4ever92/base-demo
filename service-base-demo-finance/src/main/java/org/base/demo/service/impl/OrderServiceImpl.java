package org.base.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.base.demo.service.OrderService;
import org.springframework.stereotype.Service;
import org.base.demo.entity.Order;
import org.base.demo.mapper.OrderMapper;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}
