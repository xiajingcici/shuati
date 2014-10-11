package oct2;

public class ValidPalindrome {
	public boolean isPalindrome(String s){
		String str1=s.replaceAll("[^a-zA-Z0-9]", "");
		String str2=str1.toLowerCase();
		System.out.println(str2);
		if(str2.length()==0||str2.length()==1)return true;
		for(int i=0;i<str2.length()/2;i++){
			if(str2.charAt(i)!=str2.charAt(str2.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		ValidPalindrome vp=new ValidPalindrome();
		Boolean result=vp.isPalindrome("I am OK KO__ MA i");
		System.out.println(result);

	}

}
