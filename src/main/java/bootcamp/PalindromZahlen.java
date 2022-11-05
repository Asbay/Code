package bootcamp;

public class PalindromZahlen {
    public static void main(String[] args) {

    int c;
    int ikincisayi=0;
    int ilksayi=0;
    int max = 100;
        for (int i = 100; i <1000; i++) {
        for (int j =100; j <1000; j++) {
            c=i*j;
            if (c==terscevir(c)&&c>max){
                max = c;
                ilksayi=i;
                ikincisayi=j;
            }

        }
    }
        System.out.println(ilksayi+"*"+ikincisayi+"="+max);

}
    public static int terscevir(int a){
        String kutu="";
        int ters = 0;
        String terssayi=String.valueOf(a);
        for (int i =terssayi.length()-1; i>-1; i--) {
            kutu+=terssayi.charAt(i);
            ters=Integer.valueOf(kutu);
        }
        return ters;

    } }

