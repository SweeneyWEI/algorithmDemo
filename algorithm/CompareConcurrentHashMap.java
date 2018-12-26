package org.Test.Instances.algorithm;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * Created by weixin on 18-2-7.
 */
public class CompareConcurrentHashMap {

//    public static volatile int a=0;

    public static void add(){
        int a=1;
        for (int i=0;i<100;i++){
            System.out.println(i);
        }

    }


    public static void main(String[] args) throws InterruptedException {

        for (int i=0;i<1000;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    CompareConcurrentHashMap.add();
                }
            }).start();
        }
//        Thread.sleep(5000);
//        System.out.println(a);
    }
}
