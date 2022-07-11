package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int sayi;
        int i, j, k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç basamaklý yýldýz bastýrmak istersin : ");
        sayi = scanner.nextInt();


        for (i = sayi; i > 0; i--) {
            for (j = sayi - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}