package oct2;

public class LongestPalindrome {
	public String longestPalindrome(String s){
		int maxlength=1;
		
		
		
		return s;		
	}
	private boolean isPalindrome(String s){
		if(s.length()==0||s.length()==1) return true;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)==s.charAt(s.length()-1-i)){
				return true;
			}
		}
		return false;
	}
}
