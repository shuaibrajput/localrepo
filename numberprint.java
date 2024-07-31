import java.util.Scanner;

public class numberprint {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("print the n number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
        
        }
    }
