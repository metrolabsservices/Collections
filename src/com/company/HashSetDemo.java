package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String args[])
    {
        HashSet<Integer> h=new HashSet< Integer>();
        h.add(100);
        h.add(200);
        h.add(300);
        h.add(400);
        h.add(500);
        System.out.println(h);
        LinkedHashSet<String> lh=new LinkedHashSet<String>();
        lh.add("pranitha");
        lh.add("rishitha");
        lh.add("akshitha");
        System.out.println(lh);
        TreeSet<Integer> t=new TreeSet< Integer>();
        t.add(700);
        t.add(600);
        t.add(800);
        System.out.println(t);

    }
}
