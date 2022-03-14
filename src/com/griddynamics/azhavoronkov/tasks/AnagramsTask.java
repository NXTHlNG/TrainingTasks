package com.griddynamics.azhavoronkov.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramsTask {
    static boolean isAnagram(String a, String b) {
        int len;
        if ((len = a.length()) != b.length()) {
            return false;
        }

        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < len; i++) {
            freq.merge(a1.charAt(i), 1, (x, y) -> x + 1);
            freq.merge(b1.charAt(i), 1, (x, y) -> x - 1);
        }

        return freq.values().stream().allMatch(x -> x == 0);
    }

    static boolean isAnagram1(String a, String b) {
        int len;
        if ((len = a.length()) != b.length()) {
            return false;
        }

        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();

        int[] arr = new int[26];

        for (int i = 0; i < len; i++) {
            arr[a1.charAt(i) - 'a']++;
            arr[b1.charAt(i) - 'a']--;
        }

        for (int i : arr) {
            if (i != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
