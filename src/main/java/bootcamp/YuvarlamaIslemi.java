package bootcamp;

import java.util.Scanner;

public class YuvarlamaIslemi {
    /*
    Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Son basamak 5 'e eşit ve 5 den büyükse, yuvarlama işlemi: "Son basamağı bir üst ondalı-
ğa yuvarla"
b) Son basamak 5 den küçükse, yuvarlama işlemi: "Son basamağı bir alt ondalığa yuvarla"
Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
125 yukarı yuvarlanacak ve değer 130 olacaktır. 123 aşağı yuvarlanacak ve değer 120 olacaktır

    int year = 2022;
    String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");
        System.out.println(leap);
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yuvarlamak istediginiz sayiyi giriniz");
        int sayi = input.nextInt();

        int sonuc = (sayi%10 >= 5 ) ? (sayi + (10- sayi%10)) : (sayi -(sayi%10))  ;

        System.out.println(sonuc);
    }
}
