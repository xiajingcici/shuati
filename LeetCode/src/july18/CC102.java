package july18;

public class CC102 {
	public String reverse(String s){
		char[] c=new char[s.length()];
		for(int i=0,l=s.length()-1;i<s.length()&&l>=0;i++,l--){
			c[l]=s.charAt(i);
		}
		return new String(c);
	}
	
	public static void main(String[] args) {
		
		System.out.println(new CC102().reverse("Hello,World"));
	}
}
