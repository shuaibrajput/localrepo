import java.util.Scanner;

public class solution {
    public static void main (String args[]){
     Scanner sc=new Scanner(System.in);
     int number;
     int choice;
     int evensum=0;
     int oddsum=0;
     do {
        System.out.print("enter the number");
         number=sc.nextInt();
        if(number%2==0){
            evensum +=number;
        } else{
            oddsum +=number;
        }
        System.out.print(" Do you want to continue ? press 1 yes for press 0 no");
        choice = sc.nextInt();
     } while(choice==1);
     System.out.println("even number sum"+ evensum);
     System.out.print("odd number sum"+ oddsum);
     
     }
    }


