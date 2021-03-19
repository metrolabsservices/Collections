package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[])
    {
        LinkedList<String> l=new LinkedList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.add("f");
        l.add("g");
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
         l.remove("f");
        System.out.println(l);
        System.out.println("The size is : " +l.size());
        Iterator<String> i=l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        LinkedList<Integer> a=new LinkedList<Integer>();
        a.add(5);
        a.add(10);
        a.add(15);
        a.add(20);
        System.out.println(a);
        Iterator<Integer> b=a.iterator();
        while(b.hasNext()){
            System.out.println(b.next());
        }
        a.removeFirst();
        a.removeLast();

        System.out.println(a);
    }
}
