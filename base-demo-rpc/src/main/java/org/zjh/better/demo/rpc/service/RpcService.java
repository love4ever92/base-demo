package org.zjh.better.demo.rpc.service;

import org.apache.dubbo.config.annotation.Service;
import org.zjh.better.demo.rpc.Rpc;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author：zjh
 * @ClassName:
 * @Description:
 * @date：2020/11/4 21:03
 */
@Service
public class RpcService implements Rpc {


    public CompletableFuture<String> rpc(){
        return
                CompletableFuture.supplyAsync(() -> {
        return "rpc";
    }, Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 40 * (1 + 5 / 2)));
}
}
