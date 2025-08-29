package com.github.acr301.scannerexpresiones;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
        System.out.println(suma);
    }
}