package com.huaying.hqwmall.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

public class CommonThreadPoolUtil {
    private static final Logger LOGGER=LoggerFactory.getLogger(CommonThreadPoolUtil.class);

    private static final Map<String,ThreadPoolExecutor> poolMap = new ConcurrentHashMap<>();

    private static final Semaphore semaphore = new Semaphore(1);

    public static ThreadPoolExecutor getThreadPool(String key,int threadCount){

        return null;


    }
}
