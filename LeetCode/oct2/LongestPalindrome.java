package oct2;

import java.util.Arrays;

public class LongestPalindrome {
	//brutal force
	public String longestPalindrome1(String s){
		int max=0;
		String res=null;
		int len=s.length();
		for(int i=0;i<=len;i++){
			for(int j=i+1;j<=len;j++){
				int temp=j-i;
				String curr=s.substring(i,j);
				if(isPalindrome(curr)){
					if(temp>max){
						res=curr;
						max=temp;
						System.out.println(res);
					}
				}
			}
		}
		return res;
	}
	private static boolean isPalindrome(String s){
		if(s.length()==0||s.length()==1) return true;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	//optimize
	public static String longestPalindrome(String s){
		if(s==null) return null;
		if(s.length()<=1) return s;
		String res=s.substring(0,1);
		int len=s.length();
		for(int i=0;i<len;i++){
			String tmp=helper(s,i,i);
			if(tmp.length()>res.length()){
				res=tmp;
			}
			tmp=helper(s,i,i+1);
			if(tmp.length()>res.length()){
				res=tmp;
			}
		}
		return res;
	}
	
	private static String helper(String s, int begin, int end) {
		while(begin>=0&&end<=s.length()-1&&s.charAt(begin)==s.charAt(end)){
			begin--;
			end++;
		}
		return s.substring(begin+1,end);
	}
	public static void main(String args[]){
		LongestPalindrome lp=new LongestPalindrome();
		String s="bb";
		String x=lp.longestPalindrome1(s);
		System.out.println("Result="+x);
	}
}
