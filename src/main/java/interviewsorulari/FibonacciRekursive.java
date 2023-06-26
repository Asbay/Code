package interviewsorulari;

public class FibonacciRekursive {


    public static void main(String[] args) {

        System.out.println(fibo(5));
    }


    public static int fibo(int n) {
     //F(0) = 0; F(1) =1
       // F(2)= F(1)+F(0)
        // F(3)= F(2) +F(1)
        // F(n) = F( n-1) + F(n-2)

        if(n==0 || n==1) {
            return n;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
