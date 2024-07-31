import java.util.Scanner;

public class matrix {
    public static void largest(int matrix[][] ,int n ,int m){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(largest<matrix[i][j]){
                largest=matrix[i][j];
            }
        }
            }
        System.out.println(" LARGEST ELEMENT="+largest);
    }
    public static boolean search(int matrix[][] ,int key ,int n ,int m){
         // output
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(matrix[i][j]+" ");
        }
                System.out.println();  
    }
     
        System.out.println();
        // search(matrix, m)
         for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==key){
            System.out.print("foun at cell"+"(" +i+ ","+j+")");
            return true;
            }
        }

    }
    System.out.println(" not found");
    return false;
    }
    public static void main(String args[]){
    // create
    int matrix[][]=new int [3][3];
    //int n=3,m=3;
   int n=matrix.length, m=matrix[0].length;
   // input
   Scanner sc=new Scanner(System.in);
  // matrix[3][3]=sc.nextInt();
    // output
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
    
    }
    search(matrix,5,n,m);
    largest(matrix, n, m);
    //System.out.println(largest(matrix, n, m));
    }
}
