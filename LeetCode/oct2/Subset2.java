package oct2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num){
		ArrayList<Integer> result=new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> results=new ArrayList<ArrayList<Integer>>();
		results.add(result);
		if(num.length==0) return results;
		Arrays.sort(num);
		int j=0;
		for(int i=0;i<num.length;i++){
			int size=results.size();
			for(;j<size;j++){
				ArrayList<Integer> temp=new ArrayList(results.get(j));
				temp.add(num[i]);
				results.add(temp);
			}
			if(i+1<num.length&&num[i]==num[i+1]){
				j=size;
			}else{
				j=0;
			}		
		}
		return results;
	}
	
	public static void main(String[] args) {
		Subset2 s2= new Subset2();
		int[] num={1,1,2,2,3};
		ArrayList<ArrayList<Integer>> res=s2.subsetsWithDup(num);
		System.out.println(res);
	}

}
