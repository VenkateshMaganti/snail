package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int h = s.nextInt();
        //int sum = 0, c = 0;
//        while(sum != h){
//            sum += a;
//            sum -= b;
//            if(sum != h){
//                c++;
//            }
//        }
//        if(sum == h) {
//            System.out.println(c);
//        }
//        else {
//            System.out.println("Impossible");
//        }
//        int hg = a, days = 0;
//
//        if(a <= b && a < hg){
//            System.out.println("Impossible");
//        } else if (a == hg) {
//            System.out.println("1");
//        } else {
//            if(a > hg) {
//                System.out.println("1");
//            } else{
//                while(hg <= h){
//                    hg = hg + a;
//                    hg = hg - b;
//                    days = days + 1;
//                }
//                System.out.println(days);
//            }
            if(h < a){
                System.out.println(1);

            }else if(a == b){
                System.out.println("Impossible");
            }else{
                int n = (h -a) / (a - b) + 1;
                if(n < 0){
                    System.out.println("Impossible");
                }else {
                    System.out.println(n);
                }
            }


    }
}
