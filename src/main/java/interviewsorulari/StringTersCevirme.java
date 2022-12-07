package interviewsorulari;



import java.util.Arrays;
import java.util.Scanner;

public class StringTersCevirme {

    /*kullanicidan 2 tane string aliniz . aldiginiz Stringlerin  "Anagram " olup olmadigini kontrol eden kodu yaziniz...
"Anagram ": String'deki karakter sayisi ve karakter esitligi demetir
Örn: "Mary","army","ramy" bunlar "Anagram"dir
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk stringi giriniz");
        String s1= input.next();
        System.out.println("ikinci stringi giriniz");
        String s2= input.next();
        isAnagram(s1, s2);
    }
    private static void isAnagram(String s1, String s2) {

        String[] a1= s1.toLowerCase().split("");
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        String[] a2= s2.toLowerCase().split("");
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));

        if (s1.length() != s2.length()) {
            System.out.println("Bu String'ler 'Anagram' degildir");
        } else if(s1.isEmpty() || s2.isEmpty()){
            System.out.println("Bu String'ler 'Anagram' degildir");
        } else if (Arrays.equals(a1,a2)){
            System.out.println("Bu stringler Anagram dir");
        }else
            System.out.println("Bu String'ler 'Anagram' degildir");
    }
}
