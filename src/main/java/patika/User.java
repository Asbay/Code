package patika;

public class User {

    public String name;
    public static int counter;

    static {
        System.out.println("2. static blogu");
        int random = (int) (Math.random()*10);
        System.out.println("3.random sayi "+ random);
        counter= random;
        System.out.println("4. counter atanan deger "+ counter);
    }

    public User(String name){
        this.name = name;
        System.out.println("");
        counter++;
        System.out.println("counter yeni deger "+ counter);
    }
}
