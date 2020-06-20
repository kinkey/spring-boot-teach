package com.learning.springboot.sda.lnkLst;


public class LnkedLst {

    public Node head;

    public LnkedLst(int value) {

        this.head = new Node(value);
    }

    public LnkedLst(Node node){
        this.head = node;
    }

    public void addNodes(int value){

        if(head.next == null){
            head.next = new Node(value);
        } else {
            Node tempHead = head;

            while(tempHead.next != null){
                tempHead = tempHead.next;
            }
            tempHead.next = new Node(value);
        }


    }


    @Override
    public String toString() {
        return "LnkedLst{" +
                "head=" + head +
                '}';
    }
}
