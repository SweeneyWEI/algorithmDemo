package org.Test.Instances.algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Timer;

/**
 * Created by weixin on 17-10-18.
 */
public class bubbleSort {
    public static void main(String[] args) {
        long start=System.nanoTime();


        int[] a={9,8,7,6,5,4,3,2,1};
//        System.out.println(a.length);
        int temp=0;
        for(int i=1;i<=a.length;i++){
            for(int j=a.length-1;j>=i;j--){
                if(a[j]<a[j-1]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }


        long end=System.nanoTime();
        System.out.println(end-start);
    }
}
