package interviewsorulari;

import java.util.Scanner;

public class SoruYildizPramidTers {


/*
Kullanıcıdan ters çevrilmiş bir yarım piramidin satır sayısını girmesini isteyin.
Ters yarım piramit oluşturmak için bir program yazın.
Örneğin satır sayısı 5 ise piramit şöyle olacaktır

* * * * *
* * * *
* * *
* *
*

 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisi giriniz");
        int satir = input.nextInt();
        for (int i = satir; i >= 1; i--) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
