package oct2;

public class ReverseWords {
	public String reverseWords(String s){
		String[] str=s.split(" +");
		for(String a:str){
			System.out.println(a);
		}
		StringBuilder sb=new StringBuilder();
		for(int i=str.length-1;i>=0;i--){
			sb.append(str[i]+" ");
		}
		String result=sb.toString();
		return result.trim();
	}
	public static void main(String[] args) {
		ReverseWords rw=new ReverseWords();
		System.out.println(rw.reverseWords("   a   b "));

	}

}
