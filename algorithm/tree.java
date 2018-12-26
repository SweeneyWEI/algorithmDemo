package org.Test.Instances.algorithm;


import org.omg.CORBA.TRANSACTION_MODE;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by weixin on 17-10-19.
 */
public class tree {
    private TreeNode root=null;

    private tree(){
        root=new TreeNode(1,"rootNode(A)");
    }

    public void createBinTree(TreeNode root){
        TreeNode newNode2=new TreeNode(2,"B");
        TreeNode newNode3=new TreeNode(3,"C");
        TreeNode newNOde4=new TreeNode(4,"D");
        TreeNode newNode5=new TreeNode(5,"E");
        TreeNode newNode6=new TreeNode(6,"F");
        TreeNode newNode7=new TreeNode(7,"G");
        root.leftChild=newNode2;
        root.rightChild=newNode3;
        root.leftChild.leftChild=newNOde4;
        root.leftChild.rightChild=newNode5;
        root.rightChild.leftChild=newNode6;
        root.rightChild.rightChild=newNode7;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public int height(){
        return height(root);
    }

    public int size(){
        return size(root);
    }

    public void visited(TreeNode subTree){
        subTree.isVisited=true;
        System.out.println("key:"+subTree.key+"--"+"data:"+subTree.data);
    }
    //先序遍历
    public void preOrder(TreeNode subTree){
        if(subTree!=null){
            visited(subTree);
            preOrder(subTree.leftChild);
            preOrder(subTree.rightChild);
        }
    }
    //中序遍历
    public void inOrder(TreeNode subTree){
        if(subTree!=null){
            inOrder(subTree.leftChild);
            visited(subTree);
            inOrder(subTree.rightChild);
        }
    }
    //后序遍历
    public void postOrder(TreeNode subTree){
        if(subTree!=null){
            postOrder(subTree.leftChild);
            postOrder(subTree.rightChild);
            visited(subTree);
        }
    }
    //高度
    private int height(TreeNode subTree) {
        if(subTree==null){
            return 0;
        }
        else {
            int i = height(subTree.leftChild);
            int j = height(subTree.rightChild);
            return (i<j) ? (j+1):(i+1);
        }
    }
    //size
    private int size(TreeNode subTree){
        if(subTree==null){
            return 0;
        }
        return 1+size(subTree.leftChild)
                +size(subTree.rightChild);
    }


//树的宽度
   private int getWidth(TreeNode root){
        int Width=0;
        int LastLevelWidth=0;
        int temp=0;
        int CurLevelWidth=0;

        if(root==null){
            return 0;
        }
        Queue<TreeNode> myQueue=new LinkedList<TreeNode>();
        myQueue.add(root);
        LastLevelWidth=1;
        Width=1;

        while (!myQueue.isEmpty()){
            temp=LastLevelWidth;
            TreeNode tmp=null;
            while (temp != 0){
                tmp=myQueue.peek();
                myQueue.poll();
                if(tmp.leftChild!=null) {
                    myQueue.add(tmp.leftChild);
                }
                if(tmp.rightChild!=null){
                    myQueue.add(tmp.rightChild);
                }
                temp--;
            }
            CurLevelWidth=myQueue.size();
            Width=(CurLevelWidth>Width)?CurLevelWidth:Width;
            LastLevelWidth=CurLevelWidth;
        }
        return Width;
   }




    private class TreeNode{
        private int key=0;
        private String data=null;
        private boolean isVisited=false;
        private TreeNode leftChild=null;
        private TreeNode rightChild=null;

        public TreeNode(){}

        public TreeNode(int key,String data){
            this.key=key;
            this.data=data;
            this.leftChild=null;
            this.rightChild=null;
        }
    }




    public static void main(String[] args) {
        tree bt=new tree();
        bt.createBinTree(bt.root);
        System.out.println("height:"+bt.height());
        System.out.println("size:"+bt.size());
        System.out.println("先序遍历");
        bt.preOrder(bt.root);
        System.out.println("中序遍历");
        bt.inOrder(bt.root);
        System.out.println("后序遍历");
        bt.postOrder(bt.root);
        int width=bt.getWidth(bt.root);
        System.out.println("width:"+width);
    }
}
