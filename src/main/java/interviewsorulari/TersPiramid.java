package interviewsorulari;

import java.util.Scanner;

public class TersPiramid {

    /*
   *******
    *****
     ***
      *
Kullanıcıdan ters çevrilmiş bir piramidin satır sayısını girmesini isteyin.
Ters piramit oluşturmak için bir program yazın.
   Örneğin; satır sayısı 5 ise piramit şöyle olacaktır;
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisi giriniz");
        int satir = input.nextInt();


        for(int i =satir; i>0 ; i--) {

            for (int space = satir - i; space > 0; space--) {
                System.out.print(" ");
            }

            for (int j = (2 * i - 1); j > 0; j--) {

                System.out.print("*");
            }
            System.out.println();
        }



        }




    }
