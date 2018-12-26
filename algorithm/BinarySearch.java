package org.Test.Instances.algorithm;

import java.util.Scanner;

/**
 * Created by weixin on 17-10-18.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6,7,8,9};
        int b=9;
        int low = 0, mid, high = a.length;
            while (low <= high) {
                if(b>a[a.length-1]){
                    System.out.println("超出范围...");
                }
                mid = (low + high) / 2;
                if (b == a[mid]) {
                    System.out.println("index"+mid+"  是你要查找的值");
                    break;
                } else if (b > a[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }

