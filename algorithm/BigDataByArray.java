package org.Test.Instances.algorithm;

/**
 * Created by weixin on 17-10-21.
 */
public class BigDataByArray {//用数组计算结果非常大的数字运算
    public static void main(String[] args) {
//        double num=1;
//        int n=50;
//        for(int i=1;i<=n;i++){
//            num=num*i;
//        }
//        System.out.println(num);
//        ints[ints.length-1]=2;
//        ints[ints.length-2]=3;
//        ints[ints.length-3]=7;
//        int num=16;
//        demo(ints,num);

        int[] ints=new int[200];
        int n=100;
        ints[ints.length-1]=1;
        for(int i=1;i<n;i++){
            ints=demo(ints,i);
        }
        for(int i=0;i<ints.length;i++) {
            if(ints[i]!=0){
                for(int j=i;j<ints.length;j++){
                    System.out.print(ints[j]);
                }break;
            }

        }


    }
    static int[] demo(int[] ints,int num){//
        for(int i=0;i<ints.length;i++){
            ints[i]*=num;
        }

        for (int i=ints.length-1;i>0;i--){
            ints[i-1]+=ints[i]/10;
            ints[i]=ints[i]%10;
        }
         return ints;
    }
}
