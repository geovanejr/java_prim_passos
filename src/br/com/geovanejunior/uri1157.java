package br.com.geovanejunior;

import java.util.Locale;
import java.util.Scanner;

public class uri1157 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for (int i=1; i<=X; i++) {

            if (X % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}