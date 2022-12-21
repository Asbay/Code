package patika;

public class MainGetterSetter {

    public static void main(String[] args) {

        GetterSetterKitap book= new GetterSetterKitap("ask",230,"Elif Safak");

        System.out.println(book.getSayfaSayisi());
        System.out.println(book.getYazar());
        book.setKitapAdi("geldim");
        System.out.println(book.getKitapAdi());
        book.setSayfaSayisi(250);
        System.out.println(book.getSayfaSayisi());
    }
}
