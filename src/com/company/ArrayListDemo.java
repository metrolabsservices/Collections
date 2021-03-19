package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(4);
        a.add(10);
        a.add(15);
        a.add(20);
        a.add(25);
        a.add(30);
        a.add(35);
        a.add(45);
        a.add(45);
        System.out.println("Actual ArrayList is :" +a);
       int b= a.remove(8);
        System.out.println("Removing an element :" +a);
        a.add(7,40);
        System.out.println("Replacing 45 by 40 is :" +a);
        a.set(0,5);
        System.out.println("Setting Array is :" +a);
        a.add(9,50);
        System.out.println("The final array list is : " +a );
        b= a.size();
        System.out.println("The array size is " +b);
        for(int i: a)
        {
            System.out.println("The iteration is " +i);
        }
        ArrayList<String> s=new ArrayList<String>();
        s.add("pranitha");
        s.add("rishitha");
        s.add("akshitha");
        s.add("kavitha");
        s.add("haritha");
        System.out.println(" The string array list is " +s);
        for(String str:s)
            System.out.println(str);
        Collections.sort(s);
        System.out.println(" The final array list" +s);
        System.out.println("The string size : " +s.size());
        System.out.println(+s.indexOf("haritha"));

    }
}
