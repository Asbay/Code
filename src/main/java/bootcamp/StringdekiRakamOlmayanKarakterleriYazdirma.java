package bootcamp;

public class StringdekiRakamOlmayanKarakterleriYazdirma {

    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.

         */
        String str ="1a3Bcf4!...";
        String str1 = str.replaceAll("\\d", "");
        System.out.println(str1);
        System.out.println(str1.length());




    }
}
