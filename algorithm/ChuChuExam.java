package org.Test.Instances.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by weixin on 17-11-1.
 */
public class ChuChuExam {
    static String[] a;
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        a = new String[q];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String[] b = buf.readLine().split(" ");
        for(int i=0;i<b.length;i++){
            a[i]=b[i];
        }
//        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(a[num]+" "+a.length);
//            break;
        }

    }



