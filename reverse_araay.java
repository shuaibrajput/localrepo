public class reverse_araay {
    public static void revrse(int numbers[]){
         for(int i=0;i<numbers.length;i++){
    int first=0, last=numbers.length-1;
     while(first < last){
     int temp=numbers[last];
     numbers[last]=numbers[first];
     numbers[first]=temp;
     first++;
     last--; 
     } 
     System.out.print(numbers[i] +" ");
    }

}
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        revrse(numbers);
        //print
       // for(int i=0;i<numbers.length;i++){
         //   System.out.print(numbers[i] +" ");
       // }
       // System.out.println();
    }
    
}