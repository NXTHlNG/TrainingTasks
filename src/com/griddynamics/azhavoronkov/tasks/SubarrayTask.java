package com.griddynamics.azhavoronkov.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int c = list.subList(i, j).stream().reduce(Integer::sum).get();
                if (c < 0) {
                    sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}
