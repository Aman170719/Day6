import java.util.Scanner;
    public class reverseNumber{
        public static void reverseNumber(int num){
            if(num<10){
                System.out.println(num);
            }
            else {
                System.out.print(num%10);
                System.out.println(num/10);
            }
        }
    public static void main(String[] args) {
        System.out.println("Reverse of a Number");
        System.out.println("Enter the Number You want to reverse");
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();
        System.out.println("The reversed number is " );
        reverseNumber(num);
    }
    }