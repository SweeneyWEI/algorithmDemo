package org.Test.Instances.algorithm;

import org.apache.calcite.rel.core.Exchange;

/**
 * Created by weixin on 17-10-18.
 */

public class QuickSort {
    int q;
    private void quicksort(int A[],int p,int r){
        if(p<r){
            q=partition(A,p,r);//分区（无限二分）
            quicksort(A,p,q-1);
            quicksort(A,q+1,r);
        }
    }
    private int partition(int A[],int p,int r){
        int x,i,temp,temp1;
        x=A[r];
        i=p-1;
        for(int j=p;j<=r-1;j++){
            if(A[j]<=x){
                i++;
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        temp1=A[i+1];
        A[i+1]=A[r];
        A[r]=temp1;

        return i+1;
    }
    public static void main(String[] args) {

        long start=System.nanoTime();

        int[] A={9,8,7,6,5,4,3,2,1};
        QuickSort quickSort=new QuickSort();
        quickSort.quicksort(A,0,A.length-1);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

        long end=System.nanoTime();
        System.out.println(end-start);
    }
}
