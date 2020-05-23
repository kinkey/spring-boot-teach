package com.learning.springboot.sda.lnkLst;

public class Runner {

    public static void main(String[] args) {

        //LnkedLst ll = new LnkedLst(5);
        Node primulVagon = new Node(1);

        LnkedLst ll = new LnkedLst(primulVagon);

        ll.addNodes(2);
        ll.addNodes(3);
        ll.addNodes(99);


        System.out.println(ll);
    }
}
