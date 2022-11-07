package KasimYedi;

public class CiftSayilarCarpimi {

    public static void main(String[] args) {

        /*
        Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
         */

        int []arr ={1,3,5,7,9,12,14,8,10};
        int sum=1;

        for(int w:arr){

            if(w%2==0){
                sum *=w;
            }
        }
        System.out.println(sum);
}
}