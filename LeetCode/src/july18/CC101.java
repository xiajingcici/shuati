package july18;

public class CC101 {
	public boolean isUnique(String s){
		if(s.length()>256) return false;
		boolean[] b=new boolean[256];
		for(int i=0;i<s.length();i++){
			int val=s.charAt(i);
			if(b[val]){
				return false;
			}else{
				b[val]=true;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println(new CC101().isUnique(""));
	}

}
