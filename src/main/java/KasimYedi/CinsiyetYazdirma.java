package KasimYedi;

import java.util.Scanner;

public class CinsiyetYazdirma {

    /*
    Cinsiyet "Erkek" ise "Erkek" yazdırınız. Cinsiyet "Kadın" ise "Kız" yazdırınız.
Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız. Not : Bu seçenekler dışındakilerini yoksayınız.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        String str = input.next();


        if ( str.equalsIgnoreCase("erkek")){
            System.out.println("Cinsiyetiniz erkek");
        }else if ( str.equalsIgnoreCase("kadin")){
            System.out.println("Cinsiyetiniz kadin");
        }else {
            System.out.println("digerleri");
        }



    }
}
