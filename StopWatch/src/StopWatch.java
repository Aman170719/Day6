import java.util.Scanner;

public class StopWatch {
    static double START =0;
    static double STOP =0;
    static void startTime(){
            double START=System.currentTimeMillis();
            System.out.println("The Starting Point is " + START);
        }
        static void stopTime(){
        double STOP = System.currentTimeMillis();
        System.out.println("The Ending Time is " + STOP);
    }
    static void differenceTime(){
        System.out.println ("The difference time is " + (STOP-START)/1000);
        }

public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Press S to Start" );
    scan.next();
    System.out.println("Press t to stop the Timer");
    scan.next();
    stopTime();
    startTime();
    differenceTime();
}
}