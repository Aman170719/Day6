import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        System.out.println("To Check the prime Number or Not");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number You Want To Check: ");
        boolean sign =false;
        int num = scan.nextInt();
        for(int i =2; i <= num/2; i++){
            if(num == 0){
                sign = true;
                break;
            }
        }
        if(!sign){
            System.out.println("The Number is Prime");
        }
        else {
            System.out.println("The Number is not Prime");
        }
    }
}