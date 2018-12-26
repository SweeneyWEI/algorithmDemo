package org.Test.Instances.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * 输入 两个数  n和k，在输入一串数字，n表示一串数字的个数，k表示差值。计算 在n个数字中任意两个数字对之差等于k的数字对去重之后的对数。
 * Created by weixin on 18-3-24.
 */
public class touTiaoExam {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<2;i++) {
            list.add(scanner.nextInt());
        }
        Scanner scanner1=new Scanner(System.in);
        List<Integer> integerList=new ArrayList<>();
        for (int j=0;j<list.get(0);j++){
            integerList.add(scanner1.nextInt());
        }

        int number=list.get(0);
        int between=list.get(1);

        List<String> sameDouble=new ArrayList<>(new HashSet<String>());

        for (int k=0;k<integerList.size();k++){
            for (int q=0;q<integerList.size();q++){
                if (integerList.get(k)-integerList.get(q)==between){
                    String string=integerList.get(k)+","+integerList.get(q);
                    if (!sameDouble.contains(string)){
                        sameDouble.add(string);
                    }
                }
            }
        }

        System.out.println(sameDouble.size());
    }
}
