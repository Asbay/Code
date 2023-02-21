package CodingBat.String1;
/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
public class firstHalf {

    public static void main(String[] args) {
        System.out.println(firstHalf("programming"));
    }

    public static String firstHalf(String str) {
        int x =str.length() /2;
        return str.substring(0, x);

    }
}
