package org.base.demo.rpc.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BaseRpc {

    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 40 * (1 + 5 / 2));

    public CompletableFuture buildFuture(Object T){
        return CompletableFuture.supplyAsync(() -> {
            return T;
        }, EXECUTOR_SERVICE);
    }

}
