package br.com.geovanejunior;

import java.util.Locale;
import java.util.Scanner;

public class uri1079 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        double val1, val2, val3 = 0.0;
        double med = 0.0;

        for (int i=0; i<X; i++) {

            val1 = sc.nextDouble();
            val2 = sc.nextDouble();
            val3 = sc.nextDouble();

            med = (val1 * 2 + val2 * 3 + val3 * 5) / 10;

            System.out.printf("%.1f%n", med);
        }
        sc.close();
    }
}