package org.Test.Instances.algorithm;

/**
 * Created by weixin on 17-10-16.
 */
class StringKmp{
    public static int kmp(String str,String sub){
        if(str==null||sub==null||str.length()==0||sub.length()==0){
            throw new IllegalArgumentException();
        }

        int j=0;
        int[] n=next(sub);
        for(int i=0;i<str.length();i++){
            while (j>0 && str.charAt(i) !=sub.charAt(j)){
                j=n[j-1];
            }

            if(str.charAt(i)==sub.charAt(j)){
                j++;
            }
            if(sub.length()==j){
                int index=i-j+1;
                return index;
            }
        }
        return -1;
    }

    private static int[] next(String sub) {
        int[] n=new int[sub.length()];
        int x=0;
        for(int i=1;i<sub.length();i++){
            while (x>0&&sub.charAt(x)!=sub.charAt(x)){
                x=n[x-1];
            }
            if(sub.charAt(i)==sub.charAt(x)){
                x++;
            }
            n[i]=x;
        }
        return n;
    }

}

public class Kmp {
    public static void main(String[] args) {
        String str="BBC ABCDAB ABCDAB CDABDE";
        String sub="CDABD";
        int index=StringKmp.kmp(str,sub);
        System.out.println("index--->"+index);
    }
}
