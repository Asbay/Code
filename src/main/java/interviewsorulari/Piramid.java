package interviewsorulari;

import java.util.Scanner;

public class Piramid {
    /*
    Kullanıcıdan yarım piramidin satır sayısını girmesini isteyin.
Yarım piramidi oluşturmak için bir program yazın.

*
* *
* * *
* * * *
* * * * *
*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisi giriniz");
        int satir = input.nextInt();

        for( int i =1; i<= satir; i++) {

            for (int j = 1; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
