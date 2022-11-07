package bootcamp;

import java.util.Scanner;

public class AyNumarasiGirAyinAdiniCikar {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("1 den 13 e kadar bir numara giriniz");
        int ayNumarasi= input.nextInt();

        switch (ayNumarasi){

            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli numara sayisi giriniz...");
        }

    }
    }

