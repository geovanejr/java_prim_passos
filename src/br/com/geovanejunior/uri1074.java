package br.com.geovanejunior;

import java.util.Scanner;

public class uri1074 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int Y;

        for (int i=0; i<X; i++) {

            int x = sc.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            }
            else if (x % 2 == 0 && x < 0) {
                System.out.println("EVEN NEGATIVE");
            }
            else if (x % 2 == 0 && x > 0) {
                System.out.println("EVEN POSITIVE");
            }
            else if (x % 2 != 0 && x > 0) {
                System.out.println("ODD POSITIVE");
            }
            else {
                System.out.println("ODD NEGATIVE");
            }
        }
        sc.close();
    }
}