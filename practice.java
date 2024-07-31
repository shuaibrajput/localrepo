// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Arrays;
import java.util.Scanner;
public class practice{
  public static boolean primenumber(int number){
    //boolean isprime=true;
 for(int i=2;i<=number-1;i++){
      if(number%i==0){
  // isprime= false;
  return false;
}
 }
return true;
  }
  public static void primerange(int number){
    for(int i=2;i<=number;i++){
      if(primenumber(i)){
      System.out.print(i+ " ");
    }
  }
  //System.out.println();
  }
  public static boolean checknumber(int number){
    if(number>=0){
//System.out.println("Number is Positive");
return true;
}// else{
  return false;//System.out.println(" Number is negative");
}
public static void fever(Double temp){
 if(temp>100){
  System.out.println("Fever");
} else{ 
  System.out.println("Not Fever");
} 
}
public static int printweek(int week){
  switch(week){
  case 1:
  System.out.println("Monday");
    break;
  case 2:
  System.out.println("Tuesday");
  break;
  case 3:
  System.out.println("wednesday");
  break;
  case 4:
   System.out.println("Thursday");
   break;
   case 5:
    System.out.println("Friday");
    break;
    case 6:
     System.out.println("Saturday");
     break;
  case 7:
   System.out.println("Sunday");
   break;
   default :
    System.out.println("please key press (1 to 7) ");
}
return week;
    }
  
public static void printleapyear(int year){
  if((year %4==0 && year %100!=0)||(year %400==0)){
    System.out.println(" number is leap year");
  }else{
    System.out.println("number is not leap year");
  }
}
public static void leapyear(int year){
boolean x=(year %4==0);
boolean y=(year %100==0);
boolean z=((year %100==0) && (year %400==0));
if(x && (y||z)){
  System.out.println(" leap year="+ year);

}else{
  System.out.println(" not leap year="+year);
}
}
public static int factorial(int number){
 int fact=1;
for(int i=1;i<=number;i++){
  fact=fact*i;
}
  return fact;
}
//return fact;
public static void printtable(int number){
  //Scanner sc=new Scanner(System.in);
   //System.out.println("Enter A Number");
// number =sc.nextInt();
  for(int i=1;i<=10;i++){
  System.out.println(number+" *"+i+ " ="+number*i);
}
}
  public static void star(int n){
    char ch='A';
//outer loop
for(int i=1;i<=4;i++){
  // inner loop
  for(int chars=1;chars<=i;chars++){
    System.out.print(ch);
    ch++;
  }
  System.out.println();
}
}
public static int sum(int a, int b){
   return a+b;
}
// fun to call float sum
public static float sum(float a, float b){
   return a+b;
} 
     public static boolean iseven(int number){
  if(number%2==0){
    return true;
  }
  else{
  
  return false;
  }
  }
   
  public static void palindrom(int number ,int rev ,int original){
   // int original=number;
   // int rev=0;
    while(number !=0){
         int lastdigit=number%10;
          rev= rev *10 +lastdigit;
         number=number/10;
      }
    // palindrom is original and reverse value is equal
    if(original==rev){
      System.out.println("number id palindrom");

    }  else{
      System.out.println("number is not palindrom");
    }

  }
  public static int linearsearch(int numbers[], int key){
    for(int i=0;i<numbers.length;i++){
    if(numbers[i]==key){
      return i;
    }
  }
   return -1;
}
public static int binarysearch(int number[] ,int key){
 int start = 0 , end=number.length-1;
  while(start<=end){
    int mid=(start+end)/2;
    // comaprision
    if(number[mid]==key){
      return mid;

    }
    if(number[mid]<key){
       start =mid+1;
    }
    else{
      end=mid-1;
    }
  }
  return -1;
}
public static int getlargest(int numbers[]){
  //int largest=Integer.MIN_VALUE;
  int smallest=Integer.MAX_VALUE;
  for(int i=0;i<numbers.length;i++){
  if(smallest>numbers[i]){
    smallest=numbers[i];
  } 
  }
  return smallest;
}
public static void reverse(int numbers[]){
int first=0, last=numbers.length-1;
while(first<=last){
  int temp=numbers[first];
   numbers[first]=numbers[last];
   numbers[last]=temp;
first++;
last--;
}
for(int i=0;i<numbers.length;i++){
System.out.print(numbers[i]+" ");
}
}

public static void printpairs(int numbers[]){
 int tp=0;
  for(int i=0;i<numbers.length;i++){
    //int curr=numbers[i];
    for(int j=i+1;j<numbers.length;j++){
      System.out.print("("+numbers[i]+ "," +numbers[j]+ ")");
tp++;
    }
    
    System.out.println();
  }
  System.out.println(" Tpotal pairs= "+tp);  
  
}
public static void printsubarrays(int numbers[]){
  int tp=0;
  for(int i=0;i<numbers.length;i++){
   // int curr=numbers[i];
for(int j=i;j<numbers.length;j++){
  for(int k=i;k<=j;k++){
System.out.print(numbers[k]+" " );
tp++;
  }
  System.out.println();
}
//System.out.println();
  }
  System.out.println(" total pairs= "+tp);
}
public static void maxsubarrays(int numbers[]){
  int currsum=0;
  int maxsum=Integer.MIN_VALUE;
  for(int i=0;i<numbers.length;i++){

  for(int j=i;j<numbers.length;j++){
    currsum=0;
    for(int k=i;k<=j;k++){
      currsum+=numbers[k];
    }
    System.out.print(currsum+ " ");
  if(maxsum<currsum){
    maxsum=currsum;
  }
 
  }
}
 System.out.println(" MAX SUM ="+ maxsum);
}
public static int trappingrain(int height[]){
  int n=height.length;
  // left max
   int leftmax[]=new int [n];
    leftmax[0]=height[0];
    for(int i=1;i<n;i++){
    leftmax[i]=Math.max(height[i], leftmax[i-1]);
    }
    // right max
    int rightmax[]=new int [n];
    rightmax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
      rightmax[i]=Math.max(height[i],rightmax[i+1]);
    }
    int trappedwater=0;
    // loop
    for(int i=0;i<n;i++){
    int  waterlevel=Math.min(leftmax[i],rightmax[i]);
    
     trappedwater +=waterlevel -height[i];
    }
     return trappedwater;
}
public static int maxprofit(int[] prices){
  int maxprofit=0;
  int minsofar=prices[0];
  for(int i=0;i<prices.length;i++){
minsofar=Math.min(minsofar,prices[i]);
int profit=prices[i]-minsofar;
maxprofit=Math.max(maxprofit,profit);
  }
  return maxprofit;
} 
public static void bublesort(int arr[], int n){
  //int n=arr.length;
  for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
      if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;

      }
    }

  }
}
public static void printarr(int arr[], int n){ 
  for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
  }
}
public static void selectionsort(int arr[], int n){
  for(int i=0;i<n-1;i++){
   int minpos=i;
    for(int j=i+1;j<n;j++){
      if(arr[minpos]>arr[j]){
        minpos=j;

      }
      }

      int temp=arr[minpos];
     arr[minpos]=arr[i];
      arr[i]=temp;
    }
  }
// Java program for implementation of Selection Sort


public static 	void sort(int arr[])
	{
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	 public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
  public static int marks(int number[],int key ){
    for(int i=0;i<number.length;i++){
       if(number[i]==key){
        return i;
       }
      }
     return -1;
  
    }
  
  public static int largest(int number[]){
    int largest=Integer.MAX_VALUE;
  for(int i=0;i<number.length;i++){
    if(number[i]<largest){
      largest=number[i];
    }
  }
  //System.out.println("NUMBER IS LARGEST ="+largest);
  return largest;
  }
  public static int binary(int number[],int key){
 int start=0,end= number.length-1;
   while(start<=end){
  int mid =(start+end)/2;
  // compare
  if(number[mid]==key){
    return mid;
  }
   if(number[mid]>key){
    start=mid+1;
   }
   else{
    end =mid-1;
   }
   }
   return -1;
  }
  public static void reversearray(int number[]){
  int first=0,last=number.length-1;
while(first<last){
      int temp=number[first];
     number[first]= number[last];
     number[last]=temp;
     first++;
     last--;
    }
  }
public static void spiralmatrix(int matrix[][]){
  int sr=0;
  int sc=0;
  int er=matrix.length-1;
  int ec=matrix[0].length-1;
  while(sr<=er && sc<=ec){
    for(int j=sc;j<=ec;j++){
      System.out.print(matrix[sr][j]+" ");
    }
    //rigth
    for(int i=sr+1;i<=er;i++){
     System.out.print(matrix[i][ec]+" "); 
    }
    // bottom
    for(int j=ec-1;j>=sc;j--){
      if(sr==er){
        break;
    }
      System.out.print(matrix[er][j]+" ");
    }
    //left 
    for(int i=er-1;i>=sr+1;i--){
      System.out.print(matrix[i][sc]+" ");
    }
    sr++;
    sc++;
    er--;
    ec--;
  
}
  System.out.println();
}
public static void hollowprint(int n){
  for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
     // if(i==1||i==5||j==1||j==5){
        System.out.print("*");
      }
     // else{
      System.out.println();
      }
    //}/\
    System.out.println();
  }
//}
 public static void starprint(int n){
  
  for(int i=1; i<=4;i++){
    for(int j=1;j<=4-i;j++){
      System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
 }
 public static int sumi(int a, int b){
//return a*b;
//System.out.println(a*b);
 return a*b;
 }
 public static void swap(int a, int b){
  int temp=a;
  a=b;
  b=temp;
  System.out.println("a="+a);
  System.out.println("b="+b);
 }
 public static int factorialin(int n){
  int fact=1; 
  for(int i=1;i<=n;i++){
    fact=fact*i;
  }
  return fact; 
 }
 public static int bincof(int n, int r){
  int fact_n=factorial(n);
  int fact_r=factorial(r);
  int fact_nmr=factorial(n-r);
  int bincof=fact_n/(fact_r*fact_nmr);
  return bincof;
 }
 public static void sum(int a, int b ){
  System.out.println("two number"+ (a+b));
 }  
  public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  sum(a,b);
   
  }
}
