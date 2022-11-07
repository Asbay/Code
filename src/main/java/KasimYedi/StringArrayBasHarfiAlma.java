package KasimYedi;

public class StringArrayBasHarfiAlma {
    /*
    String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JJM
     */

    public static void main(String[] args) {

        String []arr = {"Kenan","Ayse","Toprak","Asya"};
        String sonuc= "";for(String w : arr){
            char sonHarf = w.charAt(w.length()-1);
char ilkHarf= w.charAt(0);
            if( sonHarf=='n' || sonHarf == 'k'){
            sonuc +=ilkHarf;
            }}
        System.out.println(sonuc);
}
}