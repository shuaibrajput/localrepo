import java.util.Scanner;

public class javapractice {
   public static int factorial(int n){
      int fact=1;
      for(int i=1;i<=n;i++){
         fact=fact*i;
      }
      return fact;

   }
   public static int bincoff(int n, int r){
      int fact_n=factorial(n);
      int fact_r=factorial(r);
      int fact_nmr=factorial(n-r);

       int bincoff=fact_n/(fact_r * fact_nmr);
       return bincoff;
   }
     public static void main (String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=sc.nextInt();
      int fact=bincoff(n, r);
      System.out.println(fact);
        

}
}