package com.griddynamics.azhavoronkov.tasks;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

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
                .collect(Collectors.toMap(Function.identity(), BigDecimal::new))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.println(e.getKey()));
    }
}
