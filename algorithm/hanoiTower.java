package org.Test.Instances.algorithm;

/**
 * 递归解决汉诺塔问题从x到z
 * n:圆盘个数及序号
 * x:原操作塔
 * z:目标操作塔
 * y:辅助转移塔
 * Created by weixin on 17-11-5.
 */
public class hanoiTower {
    public static int a=0;
    private void move(int x,int z){
            System.out.println("盘子从"+x+"移到"+z);

    }

    private void hanoi(int n,int x,int y,int z)
    {
        if(1==n){
            move(x, z);
            a++;
        }
        else
        {
            hanoi(n-1,x,z,y);
            move(x, z);
            a++;
            hanoi(n-1,y,x,z);
        }
    }
    public static void main(String[] args) {
        hanoiTower recruit=new hanoiTower();
        recruit.hanoi(6,1,2,3);
        System.out.println(a);
    }
}
