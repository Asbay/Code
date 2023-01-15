package HackerRank;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir int giriniz");
        int sayi = input.nextInt();
        System.out.println("Bir double sayi giriniz");
        double sayi2 = input.nextDouble();
        System.out.println("Bir Cümle giriniz");
        String cümle = input.nextLine();

        System.out.println("String: " + cümle);
        System.out.println("Double: " + sayi2);
        System.out.println("Int: " + 42);
}}