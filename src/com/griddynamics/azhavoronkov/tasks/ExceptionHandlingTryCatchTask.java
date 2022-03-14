package com.griddynamics.azhavoronkov.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatchTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
