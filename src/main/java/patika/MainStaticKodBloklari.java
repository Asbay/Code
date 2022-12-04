package patika;



public class MainStaticKodBloklari {

    public static void main(String[] args) {

        System.out.println("1. program basliyo");
        User u1 = new User("ayse");
        User u2= new User("ali");
        User u3 = new User("fatma");

        System.out.println("counter son deger "+ User.counter);

    }
}
