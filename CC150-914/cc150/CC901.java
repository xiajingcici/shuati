package cc150;

import java.util.HashMap;

public class CC901 {
	public int countWays(int n){
		if(n<=0) return 0;
		int[] res=new int[n];
		if(n>=1) res[0]=1;
		if(n>=2) res[1]=2;
		if(n>=3) res[2]=4;		
		if(n>=4){
			for(int i=3;i<n;i++){
				res[i]=res[i-1]+res[i-2]+res[i-3];
			}
		}		
		return res[n-1];
	}
	public static void main(String args[]){
		int n=40;
		HashMap<Integer,Integer> map=new HashMap();
		int res1=new CC901().countWays(n);
	}
	int countWaysDP(int n,HashMap<Integer,Integer> map){
		if(map.containsKey(n)) return map.get(n).intValue();
		int q=0;
		if(n<0){
			return 0;
		}else if(n==0){
			q=1;
		}else{
			q=countWaysDP(n-1,map)+countWaysDP(n-2,map)+countWaysDP(n-3,map);
		}
		map.put(n,q);
		return q;
	}
}
