package bootcamp;

import java.util.Scanner;

public class GirilenAyNumarasindanItibarenTümAylar {

    /*
    Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
  Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.
     */
    public static void main(String[] args) {


    Scanner input =new Scanner(System.in);
        System.out.println("1 den 13 e kadar bir numara giriniz");
    int ayNumarasi= input.nextInt();

        switch (ayNumarasi){

        case 1:
            System.out.println("Ocak");

        case 2:
            System.out.println("Subat");

        case 3:
            System.out.println("Mart");

        case 4:
            System.out.println("Nisan");

        case 5:
            System.out.println("Mayis");

        case 6:
            System.out.println("Haziran");

        case 7:
            System.out.println("Temmuz");

        case 8:
            System.out.println("Agustos");

        case 9:
            System.out.println("Eylül");

        case 10:
            System.out.println("Ekim");

        case 11:
            System.out.println("Kasim");

        case 12:
            System.out.println("Aralik");
            break;


        default:
            System.out.println("Gecerli numara sayisi giriniz...");
    }

}}

