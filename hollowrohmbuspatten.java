public class hollowrohmbuspatten {
    public static void Hollow_Rohmbus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<=n;j++){
                // cell (i,j)
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
      System.out.println();

        }
    }
  public static void main(String args[]){
    Hollow_Rohmbus(5);
  }
}


