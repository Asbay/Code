package CodingBat.String1;

public class Concat {
    public static void main(String[] args) {
        System.out.println(conCat("ayse","ebru"));


    }
        /* Given two strings, append them together (known as "concatenation") and
         * return the result. However, if the concatenation creates a double-char,
         * then omit one of the chars, so "abc" and "cat" yields "abcat".
         */
        public static String conCat(String a, String b){
            if (a.length() == 0 || b.length() == 0)
                return a + b;

            if (a.charAt(a.length() - 1) == b.charAt(0))
                return a + b.substring(1);

            return a + b;

    }
}