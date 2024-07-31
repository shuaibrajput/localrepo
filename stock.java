public class stock {
    public static int Buyandsell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
       if(buyprice<prices[i]){
        int profit=prices[i]-buyprice;
        maxprofit=Math.max(maxprofit,profit);

       } 
       else{
        buyprice=prices[i];
       }  

} 
return maxprofit;   }
    public static void main(String args[]){
        int prices[]={3,5,1,7,4,9,3};
        System.out.println(Buyandsell(prices));

    }
}
