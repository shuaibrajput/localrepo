public class flody_triangle_pattern {
    public static void Triangle_Pattern(int n){
        int counter=1;
        // outer loop 
        for(int i=1;i<=n;i++){
        
            // inner number
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
               counter++;
        }
       System.out.println();
    }

     }
     public static void main(String args[]){
     // int counter=1;
        Triangle_Pattern(5);
     }
    
}
