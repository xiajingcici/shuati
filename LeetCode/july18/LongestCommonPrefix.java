package july18;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs){
		if(strs==null||strs.length==0) return "";
		int res=strs[0].length();
		if(strs.length==1) return strs[0];
		for(int i=1;i<strs.length;i++){
			res=compare(strs[0].substring(0, res),strs[i]);
		}		
		return strs[0].substring(0,res);		
	}
	
	private int compare(String result, String str) {
		int len=Math.min(result.length(),str.length());
		int i=0;
		while(i<len){
			if(str.charAt(i)!=result.charAt(i)){
				 break;
			}else{
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		LongestCommonPrefix lcp=new LongestCommonPrefix();
		String[] strs={};//{"email","emacs","emeer","eel"};
		String res=lcp.longestCommonPrefix(strs);
		System.out.println(res);
	}

}
