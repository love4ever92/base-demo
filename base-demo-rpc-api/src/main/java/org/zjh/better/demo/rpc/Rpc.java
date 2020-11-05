package org.zjh.better.demo.rpc;


import java.util.concurrent.CompletableFuture;

/**
 * @author：zjh
 * @ClassName:
 * @Description:
 * @date：2020/11/4 21:04
 */
public interface Rpc {
    public CompletableFuture<String> rpc();
}
