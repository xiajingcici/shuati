package july18;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public ArrayList<ArrayList<Integer>> combine(int n,int k){
		ArrayList<ArrayList<Integer>> results=new ArrayList<ArrayList<Integer>>();
		if(n<k||n<1||k<1) return results;
		ArrayList<Integer> result=new ArrayList<Integer>();
		combine(n,k,1,result,results);
		return results;
	}
	private void combine(int n,int k,int c,ArrayList<Integer> result, ArrayList<ArrayList<Integer>> results){
		if(k==0){
			results.add(new ArrayList<Integer>(result));
		}
		if(c+k-1>n) return;
		
		for(int i=c;i<=n;i++){
			result.add(i);
			combine(n,k-1,i+1,result,results);
			result.remove(result.size()-1);
		}
	}
}
