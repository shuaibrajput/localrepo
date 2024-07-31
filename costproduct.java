import java.util.*;
// bill of 3 cost product.
public class costproduct{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
  float pencil=sc.nextFloat();
  float pain=sc.nextFloat();
  float eraser=sc.nextFloat();
  float total=pencil+pain+eraser;
   System.out.println("Bill is :" + total);
   //add 18% tax.
   float newtotal=0.18f * total;
   System.out.println( "new bill is" + newtotal);
}    
}