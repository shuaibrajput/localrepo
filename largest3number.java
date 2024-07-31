import java.util.Scanner;

public class largest3number {
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
  if ((a>b) && (a>c)){
    System.out.println("print is a ");

  }  
    else if (b>c){
        System.out.println("print b");
    }
    else{
        System.out.println("print c");
    }
}
} 