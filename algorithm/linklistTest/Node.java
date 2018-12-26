package org.Test.Instances.algorithm.linklistTest;

/**
 * Created by weixin on 17-10-21.
 */
public class Node {

    Object value;
    Node next;

    public Node(Object value){
        this.value=value;

    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
