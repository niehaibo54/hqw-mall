package com.huaying.hqwmall.order;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    /*
    corePoolSize
    线程池中的核心线程数，默认情况下核心线程一直存活在线程池中，
    如果将 ThreadPoolExecutor 的 allowCoreThreadTimeOut 属性设为 true，
    如果线程池一直闲置并超过了 keepAliveTime 所指定的时间，核心线程就会被终止。
    **/
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 10, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(100));

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + "田先生您好");
            }
        });
    }

    //

}
