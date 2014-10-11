package oct2;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstringWithoutRepetition {
    public int lengthOfLongestSubstring(String s) {
    	if(s==null||s.length()==0) return 0;
    	int[] mem=new int[256];
    	Arrays.fill(mem,-1);
    	int max=1,start=0,end=1;
    	mem[s.charAt(0)]=0;
    	while(end<s.length()){
    		if(mem[s.charAt(end)]>=start){
    			start=mem[s.charAt(end)]+1;
    		}
    		max=Math.max(max, end-start+1);
    		mem[s.charAt(end)]=end;
    		end++;
    	}
    	return max;
    }

	public static void main(String[] args) {
		LongestSubstringWithoutRepetition ls=new LongestSubstringWithoutRepetition();
		String s="wlrbbmqbhcdarzowkkyhid";
		int res=ls.lengthOfLongestSubstring(s);
		System.out.println(res);
		System.out.println(s.length());

	}

}
