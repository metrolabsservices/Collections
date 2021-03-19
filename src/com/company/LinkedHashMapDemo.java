package com.company;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String args[])
    {
        LinkedHashMap<Integer,String> l=new LinkedHashMap<Integer,String>();
        l.put(700,"pranitha");
        l.put(800,"akshitha");
        l.put(900,"rishitha");
        l.put(600,"sankeerth");
        System.out.println(l);
        Hashtable<Integer,String> h=new Hashtable<Integer,String >();
        h.put(10,"jeans");
        h.put(20,"skrits");
        h.put(100,"hoddies");
        h.put(70,"shirts");
        System.out.println(h);
    }
}
