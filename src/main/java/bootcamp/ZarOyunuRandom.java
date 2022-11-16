package bootcamp;

import java.util.Random;

public class ZarOyunuRandom {
   /*
    2 zar aynı anda atılsın.
    zarların toplamı 5 veya 12 ise KAZANDINIZ mesajı verilsin.
    Kişinin 10 deneme hakkı olsun. NOT: bu koşul if ile halledilsin.
    */
   public static void main(String[] args) {
       Random random = new Random();

       int toplam = 0;
       int deneme = 1;

       while (true) {
           int zar1 = random.nextInt(6)+1;
           int zar2 = random.nextInt(6)+1;

           toplam = zar1 + zar2;


           if (toplam == 5 || toplam == 12){
               System.out.println(deneme+". denemede KAZANDINIZ");
               break;
           } else if (deneme == 10){
               break;
           } else {
               System.out.println(deneme+". deneme başarısız.");
           }
           deneme++;
       }
   }
}
