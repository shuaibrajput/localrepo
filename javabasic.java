import java.util.Scanner;

public class javabasic {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
 do {
    System.out.println("enter any number");
    int n=sc.nextInt();
    if(n%10==0){
        continue;
    }
    System.out.println("print number" + n);
 } while(true);
     }
    }
    
   
 