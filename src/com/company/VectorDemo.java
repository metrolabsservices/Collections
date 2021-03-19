package com.company;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.addElement("sweater");
        v.addElement("Hoddie");
        v.addElement("Jeans");
        v.addElement("FlipFlops");
        v.addElement("Skirt");
        System.out.println("The capacity is " +v.capacity());
        System.out.println("The size is " +v.size());
        System.out.println("The vector is " +v);
        Vector<Integer> v1=new Vector<Integer>(3);
        v1.addElement(100);
        v1.addElement(200);
        v1.addElement(300);
        v1.addElement(400);
        v1.addElement(500);
        System.out.println("The capacity is " +v1.capacity());
        System.out.println("The size is " +v1.size());
        System.out.println("The vector is " +v1);
    }
}
