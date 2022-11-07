package KasimYedi;

public class ArraydeEnKücükEnBüyükEleman {
/*
Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
 */
    public static void main(String[] args) {

        int []arr = {-12, 18, -5, -23, -2};

        int min = arr[0];
        int max = arr[arr.length-1];


        for( int w:arr){

            if( w< min){
                min = w;
            }

            if(w>max){
                max=w;
            }
        }
        System.out.println("min= "+ min);
        System.out.println("max= "+ max);
    }


}
