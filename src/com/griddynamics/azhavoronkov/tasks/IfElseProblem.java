package com.griddynamics.azhavoronkov.tasks;

import java.util.*;

public class IfElseProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        sc.close();

        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
