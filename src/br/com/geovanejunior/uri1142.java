package br.com.geovanejunior;

import java.util.Locale;
import java.util.Scanner;

public class uri1142 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int inicio = 1;
        int segundo = 0;
        int terceiro = 0;

        for (int i=1; i<=X; i++) {

            segundo = inicio + 1;
            terceiro = inicio + 2;

            System.out.printf("%d %d %d PUM%n", inicio, segundo, terceiro);

            inicio += 4;
        }

        sc.close();
    }
}