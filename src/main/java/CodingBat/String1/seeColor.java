package CodingBat.String1;

public class seeColor {

    public static void main(String[] args) {
        System.out.println(seeColor("redb"));
    }


    public static String seeColor(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("red"))
            return "red";

        if (str.length() >= 4 && str.substring(0, 4).equals("blue"))
            return "blue";

        return "";
    }

}
