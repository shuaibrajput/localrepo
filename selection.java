public class selection {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
       for(int j=0;j<arr.length-1-i;j++){
  if(arr[j]<arr[j+1]){
    // swap 
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
  }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main( String args[]){
        int arr[]={5,6,4,7,3,99};
        selectionsort(arr);
        printarr(arr);
    }
}

