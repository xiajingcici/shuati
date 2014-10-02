package july18;

public class CC108 {
	public boolean isRotation(String s1,String s2){
		if(s1.length()!=s2.length()) return false;
		String s=s1+s1;
		if(issubstring(s,s2)) return true;
		return false;
	}
	
	private boolean issubstring(String s, String s2) {
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
