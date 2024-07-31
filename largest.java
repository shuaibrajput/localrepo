public class largest {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
         if(largest<numbers[i]){
            largest=numbers[i];

         }
         if(smallest>numbers[i]){
            smallest=numbers[i];
        }

        }
        System.out.println("smallest value is "+smallest);
       // System.out.println("largest value is "+largest);
        return largest;
    }
 public static void main(String args[]){
 int numbers[]={1,4,3,7,2,5};
 int result=getlargest(numbers);
 System.out.println("largest value is "+getlargest(numbers));
   
 }   
    
}
