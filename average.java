import java.util.Scanner;

public class average {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Eneter a Number");
            int a=sc.nextInt();
             System.out.println("Eneter b Number");
            int b=sc.nextInt();
             System.out.println("Eneter c Number");
            int c=sc.nextInt();
           int avg= Average_Number(a, b, c);
           System.out.println(" average="+avg);
        }
    public static int Average_Number(int a, int b, int c){
        int sum=a+b+c;
        int avg=sum/3;
        //System.out.println(" average="+avg);
    
    return avg;
    }
}