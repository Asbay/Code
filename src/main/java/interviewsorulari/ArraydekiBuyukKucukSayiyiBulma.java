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
        int length = input.nextInt();
        int arr[] = new int[length];
        for (int i=0; i<= arr.length-1; i++){
            arr[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int dif = arr[length-1]- arr[0];
        System.out.println("fark"+ "="+ dif);
    }
}
