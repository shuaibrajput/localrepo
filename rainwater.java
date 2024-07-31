public class rainwater {
    public static int trappingrainwater(int heigth[]){
        int n= heigth.length;
     // left max boundray -array
     int leftMax[]=new int [n];  
      leftMax[0]=heigth[0];
     for(int i=1;i<n;i++){
        leftMax[i]=Math.max(heigth[i],leftMax[i-1]);
     } 
     // rigth max boundray -array
     int rigthMax[]=new int [n];
      rigthMax[n-1]=heigth[n-1];
      for(int i=n-2;i>=0;i--){
        rigthMax[i]=Math.max(heigth[i],rigthMax[i+1]);
      }
      int trappedwater=0;
      // loop
      for(int i=0;i<n;i++){
        // waterlevel =Math.min(leftMax,rigthMax)
        int waterlevel=Math.min(leftMax[i], rigthMax[i]);
        // trapped water
        trappedwater+= waterlevel-heigth[i];
      }
      return trappedwater;

    }
    public static void main(String args[]){
        int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingrainwater(height));


    }
}
