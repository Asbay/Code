package bootcamp;

public class Teilbarkeit {

    public static void main(String[] args) {

/*  1'den 20'ye kadar olan sayıların tamamına tam bölünebilen en küçük pozitif sayı
//        kaçtır
Was ist die kleinste positive Zahl, die durch alle Zahlen von 1 bis 12 teilbar ist?
        */
                int top = 0;
                int j=21;

                while (true) {
                    top=0;
                    j++;
                    for (int i = 2; i <12; i++) {
                        top += j % i;
                    }
                    if (top==0){
                        System.out.println(j);
                        break;
                    }
                }
            }


    }


