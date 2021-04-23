package com.huaying.hqwmall.order;
import java.net.URI.*;


public class TestSingleton {
    public static void main(String[] args) {

       for(int i=0;i<10000000;i++){
           Thread ti = new ThreadA();
           ti.start();
       }

    }


}

class ThreadA extends Thread{

    public void run(){
        System.out.println(Thread.currentThread());
        MyClass3.newInstance();
    }

}

class MyClass{
    private static final MyClass instance = new MyClass();
    public static MyClass newInstance(){
        return  instance;
    }

    private MyClass(){}
}

class MyClass2{
     private static MyClass2 instance=null;
     //对静态方法枷锁，就相当于对当前类对象枷锁
     public static synchronized MyClass2 newInstance(){
         if(instance==null)instance=new MyClass2();
         return  instance;
     }
     private MyClass2(){}


}


class MyClass3{

    private static MyClass3 instance =null;

    public static MyClass3 newInstance(){

        if(instance==null){


            synchronized (MyClass3.class){
                if(instance==null){
                    instance = new MyClass3();
                }
            }
        }
        return instance;
    }

    private MyClass3(){
        System.out.println("my3");
    }
}