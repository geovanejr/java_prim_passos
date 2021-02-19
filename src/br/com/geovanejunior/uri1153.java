package br.com.geovanejunior;

import java.util.Locale;
import java.util.Scanner;

public class uri1153 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int fat = 1;

        for (int i=1; i<=X; i++) {

            fat = fat * i;
        }

        System.out.println(fat);
        sc.close();
    }
}