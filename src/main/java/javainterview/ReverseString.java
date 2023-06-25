package javainterview;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Gibt ein String ein");
        String str= scan.nextLine();
         //1.way
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        System.out.println(strB.reverse());

        //2.way
        String reverseS= "";
        for(int i = str.length()-1; i >=0 ; i--){
            reverseS = reverseS + str.charAt(i);
        }
        System.out.println(reverseS);
        System.out.println(revStr(str));
    }
//3.Way: Create a method then call the method from main method




    public static String revStr(String str) {
        String revStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }

}
