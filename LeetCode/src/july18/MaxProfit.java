package july18;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int max=0;
        int min=0;
        int prof=0;
        if(prices[1]-prices[0]>=0){
            max=prices[1];
            min=prices[0];
            prof=prices[1]-prices[0];
        }else{
            max=prices[0];
            min=prices[1];
            prof=0;
        }
        for(int i=2;i<prices.length;i++){
            if(prices[i]-min>=prof){
                max=prices[i];
                prof=max-min;
                System.out.println("here is "+ prof);
            }else if(prices[i]<min){
                min=prices[i];
            }
        }
        return prof;
    }
    public static void main(String args[]){
    	MaxProfit mp=new MaxProfit();
    	int prices[]={6,1,3,2,4,7};
    	System.out.println(mp.maxProfit(prices));
    }
}
