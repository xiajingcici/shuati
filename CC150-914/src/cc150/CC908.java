package cc150;

public class CC908 {
	public int sumWays(int sum,int c,int n){
		int ways=0;
		if(sum<=n){
			if(sum==n) return 1;
			if(c>=25) ways+=sumWays(sum+25,25,n);
			if(c>=10) ways+=sumWays(sum+10,10,n);
			if(c>=5) ways+=sumWays(sum+5,5,n);
			if(c>=1) ways+=sumWays(sum+1,1,n);
		}
		return ways;
	}
	public int makeChange(int n,int denom){
		int next_denom=0;
		switch(denom){
		case 25:
			next_denom=10;
			break;
		case 10:
			next_denom=5;
			break;
		case 5:
			next_denom=1;
			break;
		case 1:
			return 1;
		}
		int ways=0;
		for(int i=0;i*denom<=n;i++){
			ways+=makeChange(n-n*denom,next_denom);
		}
		return ways;
	}
	public static void main(String[] args) {
		System.out.println(new CC908().sumWays(0, 25, 5));
	}

}
