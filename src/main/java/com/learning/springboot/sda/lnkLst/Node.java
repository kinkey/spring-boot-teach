package com.learning.springboot.sda.lnkLst;

public class Node {

    public Node next;


    public Node(int value) {
        this.value = value;
    }

    public int value;

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", value=" + value +
                '}';
    }
}
