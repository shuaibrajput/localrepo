public class diamond {
    public static void Diamond_Patten(int n){
        // 1st Half
        // outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            // space
            for(int j=1;j<=n-i;j++){
          System.out.print(" ");      
            }
            // star 
            for(int j=1;j<=2*(i-1)+1;j++){
                System.out.print("*");
            }
            System.out.println();
    
        }
    
    // 2nd Half 
    for(int i=n;i>=1;i--){
         // space
            for(int j=1;j<=n-i;j++){
          System.out.print(" ");      
            }
            // star 
            for(int j=1;j<=2*(i-1)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
   
    }
    public static void main(String args[]){
        Diamond_Patten(4);
    }

}
