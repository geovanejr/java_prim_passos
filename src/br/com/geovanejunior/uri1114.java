package br.com.geovanejunior;

import java.util.Scanner;

public class uri1114 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        while (X != 2002) {

            System.out.println("Senha Invalida");
            X = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
        sc.close();
    }
}