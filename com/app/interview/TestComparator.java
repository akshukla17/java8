package com.app.interview;

import java.util.Comparator;
import java.util.TreeSet;

public class TestComparator {
    
    public static void main (String[] args) {
        
        TreeSet t=new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
    System.out.println(t);
    }
}
class MyComparator implements Comparator{
    
    public int compare(Object a, Object b){
        Integer i=(Integer)a;
        Integer j=(Integer)b;
        if(i<j){
            return +1;
        }else if(i>j){
            return -1;
        }else{
            return 0;
        }
    }
}