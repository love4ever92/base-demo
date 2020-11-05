package org.zjh.better.demo.rpc.service;

import org.apache.dubbo.config.annotation.Service;
import org.zjh.better.demo.rpc.Rpc2;

/**
 * @author：zjh
 * @ClassName:
 * @Description:
 * @date：2020/11/5 0:00
 */
@Service
public class Rpc2Service implements Rpc2 {
    @Override
    public String rpc2() {
        return "rpc2";
    }
}
