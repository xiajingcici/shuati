package july18;

public class CC103 {
	public boolean isPerm(String s1,String s2){
		if(s1.length()!=s2.length()) return false;
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		int[] x=new int[256];
		for(char c:c1){
			x[c]+=1;
		}
		/**
		 * 1. count the char number of the first string;
		 * 2. find the char of the second string in the array;
		 * 3. --
		 */

		for(int i=0;i<s2.length();i++){
			int index=(int)s2.charAt(i);
			if(--x[index]<0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(new CC103().isPerm("hel", "leo"));

	}

}
