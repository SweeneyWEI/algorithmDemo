package org.Test.Instances.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 输入两个字符串，S  和   T   只能由a b 组成，S.length>=T.length.S有  S-T+1  个子集（字母需相邻）（长度等于T。length），求S的所有子集  和 T 的 不一样的 字符数(sum)
 *之和。
 *
 *example：S：aaabb T:bab    subS(aaa,aab,abb)   sum(aaa,bab)=2,sum(aab,bab)=1........
 * Created by weixin on 18-3-22.
 */
public class examDemo {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        String S="";
        String T="";
        int sum=0;
        for (int i=0;i<2;i++){
            Scanner scanner=new Scanner(System.in);
            stringList.add(scanner.nextLine());
        }

        S=stringList.get(0);
        T=stringList.get(1);

        List<String> subSString=new ArrayList<>(new HashSet<String>());
            if (S.length()>=T.length()){
                for (int i=0;i<S.length();i++){
                    if (S.length()-i>=T.length()){
                        subSString.add(S.substring(i,T.length()+i));
                    }

                }
            }

        for (String substring:subSString){
            char[] chars=substring.toCharArray();
            char[] chars1=T.toCharArray();

            for (int i=0;i<T.length();i++){
                if (chars[i]!=chars1[i]){
                    sum++;
                }
            }
         }
        System.out.println(sum);
    }
}
