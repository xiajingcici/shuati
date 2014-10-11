package oct2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak1(String s, Set<String> dict) {
    	int len=s.length();
    	boolean[] flag=new boolean[len+1];
    	flag[0]=true;
    	for(int i=1;i<=len;i++){
    		for(int j=0;j<i;j++){
    			if(flag[j]&&dict.contains(s.substring(j,i))){
    				flag[i]=true;
    				break;
    			}
    		}
    	}
    	return flag[len];
    }
    public boolean wordBreak2(String s,Set<String> dict){
    	boolean flag=false;
    	int len=s.length();
    	List<Integer> list=new ArrayList<Integer>();
    	for(int i=len-1;i>=0;i--){
    		String endSub=s.substring(i);
    		if(dict.contains(endSub)){
    			list.add(i);
    		}else{
    			for(Integer n:list){
    				if(dict.contains(s.substring(i,n))){
    					list.add(i);
    					break;
    				}
    			}
    		}
    	}
    	if(list.isEmpty()){
    		flag=false;
    	}else{
    		Integer n=list.get(list.size()-1);
    		flag=n==0?true:false;
    	}
    	return flag;
    }

	public static void main(String args[]) {
		WordBreak wb= new WordBreak();
		Set<String> dict = new HashSet<String>();
		dict.add("lee");
		dict.add("cod");
		dict.add("leet");
		dict.add("code");
		boolean res=wb.wordBreak1("leetcode", dict);
		System.out.println(res);

	}
}
