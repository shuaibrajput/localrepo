public class solidrhombuspattern {
    
public static void Solid_Rohmbus(int n){
    //outer loop
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // star
        for(int j=1;j<=n;j++){
       System.out.print("*");     
        }
        System.out.println();
    }
}
public static void main(String args[]){
    Solid_Rohmbus(5);
}
}
