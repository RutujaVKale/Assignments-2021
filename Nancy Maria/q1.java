package com.assignment;

public class q1 {
    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        int arg3 = Integer.parseInt(args[2]);
        if( arg1 == arg2 && arg2 == arg3)
            System.out.println("equal");
        else
            System.out.println("not equal");
        return;
    }
}
