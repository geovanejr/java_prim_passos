package br.com.geovanejunior;

import java.util.Scanner;

public class uri1072 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int Y;
        int in = 0;
        int out = 0;

        for (int i = 1; i <= X; i++) {
            Y = sc.nextInt();
            if (Y >= 10 && Y <= 20) {
                in += 1;
            } else {
               out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}