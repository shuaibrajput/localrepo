import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int number; // to hold number
    int fact=1; //to hold factorial
    System.out.println("Enter any positive number");
     number=sc.nextInt();
     for (int i=1;i<=number;i++){
        fact *=i;

     }
     System.out.println("factorial  "+ fact);
    } 
}
