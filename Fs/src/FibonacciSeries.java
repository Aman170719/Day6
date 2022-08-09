import java.util.Scanner;

public class FibonacciSeries {
        public static void main(String[] args) {
            System.out.println("Fibonacci Series");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number in the terms of Fibonacci series ");
            int n = scan.nextInt();
            int a =0;
            int b =1;
            int c =0;
            System.out.println(a);
            System.out.println(b);
            for(int i=3; i<=n ; i++){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
        }
    }