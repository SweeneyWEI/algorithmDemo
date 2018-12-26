package org.Test.Instances.algorithm;

/**
 * Created by weixin on 17-10-18.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        int[] a={1,2,5,4,6,3,8,45,1,0,45,6,9,7,12};
        int max,min;
        max=min=a[0];
        for(int i=1;i<a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(max+"&&"+min);
    }
}
