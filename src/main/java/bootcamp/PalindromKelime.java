package bootcamp;

import java.util.Scanner;

public class PalindromKelime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = input.nextLine();
        palindrom(kelime);

    }


    public static void palindrom(String kelime){


        String yeniKelime = "";


        for(int i = (kelime.length()-1); i >= 0; i--) {
            yeniKelime += kelime.charAt(i);
        }
        if(yeniKelime.equals(kelime)){
            System.out.println("Girilen kelime palindrom");
        } else System.out.println("girilen kelime palindrom degil");

    }
}
