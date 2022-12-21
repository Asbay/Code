package interviewsorulari;

import java.util.Arrays;
import java.util.Scanner;

public class ArraydekiBuyukKucukSayiyiBulma {
/*
    Erstellen Sie eine Funktion, die ein Array and akzeptiert
    gibt die Differenz zwischen der größten und der kleinsten Zahl zurück.
    Bitten Sie den Benutzer, Array-Elemente einzugeben.
 */

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Arrayin uzunlugunu giriniz");
        int uzunluk = input.nextInt();
        int[] arr = new int[uzunluk];

        System.out.println("Arrayin elemanlarini giriniz");

        for(int i =0 ; i< arr.length;i++){
            arr[i]= input.nextInt();
        }
        Arrays.sort(arr);

        int fark= arr[uzunluk-1] - arr[0];
        System.out.println(fark);

    }
}
