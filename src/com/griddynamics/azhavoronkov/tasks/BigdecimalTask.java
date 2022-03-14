package com.griddynamics.azhavoronkov.tasks;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class BigdecimalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        sc.close();

        Arrays.stream(strings)
                .sorted((s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)))
                .forEach(System.out::println);
    }
}
