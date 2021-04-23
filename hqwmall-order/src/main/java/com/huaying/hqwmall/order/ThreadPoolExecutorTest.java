package com.huaying.hqwmall.order;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService threadPool = new ThreadPoolExecutor(2, 3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 100; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}

class MyThreadFactory implements ThreadFactory {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        String threadName = "MyThread" + count.addAndGet(1);
        t.setName(threadName);
        return t;
    }
}
