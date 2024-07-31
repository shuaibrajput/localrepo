public class binary {
    public static int Binary_Search(int numbers[], int key){
    int start=0, end =numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
       // comparision
       if(numbers[mid]==key){ //found
        return mid;
       }   
       if(numbers[mid]<key){ // right
        start=mid+1;
       } 
      else{  // left
        end=mid-1;
      }
       }
       return-1;
            
        }
    
 public static void main(String args[]){
    int numbers[]={2, 4, 6, 8, 10, 12};
    int key=10;
    System.out.println("binar search =" + Binary_Search(numbers, key));
 }     

    }

