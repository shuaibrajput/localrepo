import java.util.*;
public class rotated {
    public static void Half_Pyramid(int n){
    //outer loop
    for(int i=1;i<=n;i++){
        // star 
        for(int number=1;number<=n-i+1;number++){
            System.out.print(number);
        }
        // spaces
        for(int number=1;number<=n-i;number++){
            System.out.print(" ");
        }
                
        System.out.println();
    }    
    }
    public static void main(String args[]){
       // Scanner sc=new Scanner(System.in);
        int n=5;
      Half_Pyramid(n);  
    }

    
}
