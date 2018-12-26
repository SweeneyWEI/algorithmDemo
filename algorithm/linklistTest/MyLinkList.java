package org.Test.Instances.algorithm.linklistTest;

/**
 * Created by weixin on 17-10-21.
 */
public class MyLinkList {//单向链表linkedlist(Demo)//真正的LinkedList是双向循环链表
    int size=0;
    Node head=null;

    private int size(){
        return size;

    }

    private void insert(int index,Node node){//类似指针，换引用
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.getNext();
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
        size++;
    }

    private void add(Object value){//链表，添加要添加到末尾
        Node node=new Node(value);
        if(head==null){
            head=node;
        }
        else {
            Node temp=head;
            while (temp.getNext()!=null){//从头节点开始，一直轮询到最后一个节点，然后设置next
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
        size++;
    }

    private void set(int index,Object value){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.getNext();
        }
        temp.setValue(value);
    }

    private Object get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.getNext();
        }
        return temp.getValue();
    }


    private void clear(){
        head=null;//链表，头引用最重要
        size=0;
    }

    private void removeAt(int index){
        if(index==0){
            head=head.getNext();
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());//类似指针，换引用
        size--;

    }

    public static void main(String[] args) {
        MyLinkList list=new MyLinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
//        list.set(3,12);
//        list.clear();
//        list.removeAt(3);
        Node node=new Node(20);
        list.insert(3,node);
        for(int i=0;i<list.size;i++) {
            System.out.print(list.get(i));
        }
    }
}
