package br.com.geovanejunior;

import java.util.Locale;
import java.util.Scanner;

public class uri1116 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        double val1, val2 = 0.0;
        double div = 0.0;

        for (int i=0; i<X; i++) {

            val1 = sc.nextDouble();
            val2 = sc.nextDouble();

            if (val2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                div = val1 / val2;
                System.out.printf("%.1f%n", div);
            }

        }

        sc.close();
    }
}