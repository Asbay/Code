package CodingBat.String1;

public class HelloName {

    public static void main(String[] args) {
        System.out.println(helloName("Ayse"));
    }

    /* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     */
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
