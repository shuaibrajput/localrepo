public class linear {
    public static int linearSearch(int number[], int key){
        for(int i=0;i<number.length;i++){
        if(number[i]==key) {
       return i;    
        }
    }
    return -1;
}
    public static void main(String args[]){
     int number[]={2,4,7,8,45,20,10,12};
     int key=7;
    int index=linearSearch(number, key);
    if (index==-1){
     System.out.println(" NOT FIND");

    }  
    else{
        System.out.println("Number is key in index="+ index);
    }  
    }
    }

