package interviewsorulari;

public class FaktoriyelHesaplama {

    public static void main(String[] args) {

        System.out.println("5!= "+ faktoriyelHesapla(5));
        System.out.println("5!= "+ faktoriyelRecursiveHesapla(5));


    }

    private static long faktoriyelHesapla(long sayi) {

        if(sayi ==0)
            return 1;


        long sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc = sonuc * i;


        }
        return sonuc;
    }

    private static long faktoriyelRecursiveHesapla(long sayi){
        // F(5) = 5 *F(4)
        // F(4) = 4* F(3)
        //F(x) = x * F(x-1)

        if(sayi ==0 || sayi == 1) {
        return 1L;
        }
        return sayi * faktoriyelRecursiveHesapla(sayi - 1);

    }
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

}