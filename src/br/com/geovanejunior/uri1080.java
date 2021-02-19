package br.com.geovanejunior;

import java.util.Locale;
import java.util.Scanner;

public class uri1080 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int pos = 0;
        int X;

        for (int i=0; i<10; i++) {
            X = sc.nextInt();
            if (X > maior) {
                maior = X;
                pos = i + 1;
            }
        }

        System.out.println(maior);
        System.out.println(pos);
        sc.close();
    }
}