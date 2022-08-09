import java.util.Scanner;
public class PerfectNumber {
            public static void main(String[] args) {
            int Number;
            System.out.println("Please Enter any Number which you want to check: ");
            Scanner scan = new Scanner(System.in);
            Number = scan.nextInt();
            new PerfectNumber(Number);
    }
            public PerfectNumber(int Number){
            int i;
            int Sum = 0;
            for(i=1; i < Number; i++){
                if(Number % i ==0 ) {
                      Sum = Sum +i;
                }
            }
            if(Sum == Number){
            System.out.println("It is a Perfect Number: " + Number);
            }
            else    {
            System.out.println("It is not Perfect");
        }
    }
}