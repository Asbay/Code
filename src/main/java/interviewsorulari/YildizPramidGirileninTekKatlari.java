package interviewsorulari;

import java.util.Scanner;

public class YildizPramidGirileninTekKatlari {

    /*
Kullanıcıdan bir piramidin satır sayısını girmesini isteyin.
Piramidi oluşturmak için bir program yazın. Örneğin satır sayısı 5 ise piramit şöyle olacaktır;

                                                                                   *
                                                                                 * * *
																			    * * * * *
																			  * * * * * * *
																			* * * * * * * * *
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisi giriniz");
        int satir = input.nextInt();

        for (int i = 1; i <= satir; i++) {
            for (int space = 1; space <= satir - i; space++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}