//Checkerboard pattern

package com.company;
import java.util.Scanner;

public class Checkerboard{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0)
                        System.out.print(" ");
                    else
                        System.out.print("*");

                }

            }
            System.out.println();
        }
    }
}
