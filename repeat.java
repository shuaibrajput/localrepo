import java.util.Scanner;
public class repeat {
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);   
System.out.println("Enter a Number");
int a =sc.nextInt();
System.out.println("Enter b Number");
int b=sc.nextInt();
System.out.println("Enter c number"); 
int c=sc.nextInt();
if((a>b)&&(a>c)){
 System.out.println("print a");
}
  else
  if (b>c){
    System.out.println("print b");
  }
    else {
        System.out.println("print c");
    }
 
}


    
}
    

