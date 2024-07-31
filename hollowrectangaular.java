public class hollowrectangaular {
    public static void Hollow_Rectangle(int totrows, int totcols){
        // outer loop
        for(int i=1; i<=totrows;i++){
        // inner colums
        for(int j=1;j<=totcols;j++){
            // cell (i,j)
         if(i==1 || i==totrows ||j==1 || j==totcols) {
            // bundary cell
            System.out.print("*");
         }  else {
            System.out.print(" ");
         }
        }  
        System.out.println();
        
        }
    }
    public static void main (String args[]){
    Hollow_Rectangle(4 , 5);
    }
}
