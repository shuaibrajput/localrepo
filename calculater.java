import java.util.Scanner;

public class calculater {
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a number : ");
    int a=sc.nextInt();
    System.out.println("enter b number : ");
    int b=sc.nextInt();
    System.out.println("enter opertor : ");
    char operator=sc.next().charAt(0);
    switch(operator){
        case '+': System.out.println(a+b);
                  break;
        case '-': System.out.println(a-b);
                  break;
        case '*': System.out.println(a*b);
                  break;
        case '/': System.out.println(a/b);
                  break;
        case '%': System.out.println(a%b);
                  break;
        default: System.out.println("wrone calculator");
    }
    } 
}
