package cc150;

import java.util.ArrayList;

public class CC904 {
	public ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set,int index){
		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size()==index){
			allsubsets=new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
		}else{
			allsubsets=getSubsets(set,index+1);
			int item=set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets=new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset:allsubsets){
				ArrayList<Integer> newsubset=new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);
		}
		return allsubsets;
	}
	public static void main(String args[]){
		ArrayList<Integer> set=new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		int index=0;
		System.out.println(new CC904().getSubsets(set, index));
	}
}
