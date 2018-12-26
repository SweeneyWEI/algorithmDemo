package org.Test.Instances.algorithm;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.sql.Time;
import java.util.Arrays;

/**
 * Created by weixin on 17-10-21.
 */
public class InputSort {

    public static void main(String[] args) {
        long start=System.nanoTime();


//    int[] a=new int[1000];
//    int p=1000,q=0;
//    while (p>0) {
//        if(q < a.length) {
//                a[q] = p;
//                q++;
//            }
//        if ( p > 0) {p--;}
//    }
    int temp;
        int[] a={9,8,7,6,5,4,3,2,1};

    for(int i=1;i<a.length;i++){
        if(a[i]<a[i-1]) {
            for(int j=0;j<=i;){

                if(a[i]>a[j]){
                    j++;
                }
                else if(a[i]<=a[j]){
                    temp=a[i];
                    for (int k=i-1;k>=j;k--){

                            a[k + 1] = a[k];
                    }
                    a[j]=temp;
                    break;
                }
            }
        }
    }
    for(int i=0;i<a.length;i++) {
        System.out.print(a[i] + " ");
    }


    long end=System.nanoTime();
        System.out.println(end-start);

    }
}
