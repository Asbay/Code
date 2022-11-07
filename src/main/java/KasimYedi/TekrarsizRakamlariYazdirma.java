package KasimYedi;

import java.util.Scanner;

public class TekrarsizRakamlariYazdirma {

    public static void main(String[] args) {

        /*
        Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız. Örnek; 223878  ́ 37
         */
        int sayi = 223878;

        String str = String.valueOf(sayi);
        String sonHali= "";

        for(int i=0; i< str.length()-1 ; i++){

            for(int j=1; j< str.length()-1 ;j++){

                if(str.charAt(i) != str.charAt(j)){
                    sonHali += str.charAt(i);
                }
            }

        }
        int sayiSonHali= Integer.valueOf(sonHali);
        System.out.println(sonHali);
    }
}
