package org.Test.Instances.algorithm;

import java.util.Arrays;

/**
 * Created by weixin on 17-11-5.
 */
public class MergeSort {
    public static void main(String []args){
        int []arr = {5,12,4,9,5,23,7,1,45,0,5,6,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        int []temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        sort(arr,0,arr.length-1,temp);
    }
    private static void sort(int[] arr,int left,int right,int []temp){
        if(left<right){
            int mid = (left+right)/2;
            sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
            sort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }

    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i=left;//左序列指针
        int j=mid+1;//右序列指针
        int t=0;//临时数组的指针

        while (i<=mid&&j<=right){
            if(arr[i]<arr[j]){
                temp[t++]=arr[i++];
            }
            else {
                temp[t++]=arr[j++];
            }
        }

        //每次只有一个执行
        while (i<=mid){//若有，把左边的剩余的全部移入temp
            temp[t++]=arr[i++];
        }
        while (j<=right){//若有，把右边的剩余的全部移入temp
            temp[t++]=arr[j++];
        }

        t=0;
        while (left<=right){//把temp复制入arr数组
            arr[left++]=temp[t++];
        }

    }
}