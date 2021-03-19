package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;

public class TreeMapDemo {
    public static void main(String args[])
    {
        TreeMap<Integer,String> t=new TreeMap<Integer,String>();
        t.put(400,"pranitha");
        t.put(500,"rishitha");
        t.put(600,"akshitha");
        t.put(700,"sankeerth");
        t.put(800,"kavitha");
       System.out.println(t);
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        h.put(800,"pqr");
        h.put(900,"bcd");
        h.put(600,"efg");
        h.put(800,"lmn");
        System.out.println(h);
    }
}
