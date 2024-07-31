import java.util.Scanner;

public class Array_java {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
       int marks[]=new int[50];
       System.out.println(" Length of Array "+ marks.length);
       // Scanner sc =new Scanner (System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
 System.out.println("phy :"+marks[0]);
 System.out.println("chem :"+marks[1]);
 System.out.println("math :"+marks[2]);
 //update
  marks[1]=100;
  marks[1]=marks[1]+2;
  System.out.println("chem :"+ marks[1]);
  // Percentage
int percentage=(marks[0]+marks[1]+marks[2])/3;
System.out.println("Percentage ="+percentage+ "%");
    }
}
