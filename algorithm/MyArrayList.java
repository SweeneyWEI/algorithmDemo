package org.Test.Instances.algorithm;

import clojure.lang.ExceptionInfo;

/**
 * Created by weixin on 17-10-21.
 */
public class MyArrayList {

    private Object[] obj=new Object[4];

    private int size=0;

    public int size(){
        return size;
    }

    public void add(Object value){
        if(size>=obj.length){//扩容
            Object[] temp=new Object[obj.length*3/2+1];
            for(int i=0;i<obj.length;i++){
                temp[i]=obj[i];
            }
            obj=temp;
        }
        obj[size]=value;
        size++;
    }

    public void set(int index,Object value) throws Exception {
        if(index<=size&& index>-1) {
            obj[index] = value;
        }
        else {
            throw new Exception("输入有误");
        }
    }

    public Object get(int index){
        if(index<=size&&index>-1) {
            return obj[index];
        }
        else return null;
    }

    public void clear(){
        size=0;//最简单的方法，
        obj=new Object[4];//为了内存考录，重新创建引用，之前的数组没有引用随后便会被gc回收
    }

    public void removeAt(int index) throws Exception {
        if(index<0||index>size){
            throw new Exception("超出范围");
        }
        for (int i=index+1;i<size;i++){
            obj[i-1]=obj[i];
        }
        size--;
    }


    public static void main(String[] args) throws Exception {
        MyArrayList arrayList=new MyArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.set(3,"weixin");
        arrayList.removeAt(1);
        arrayList.removeAt(1);
        arrayList.removeAt(1);
        for (int i=0;i<arrayList.size;i++){
            System.out.print(arrayList.get(i));
        }

    }
}
