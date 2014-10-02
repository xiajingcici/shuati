package july18;

public class CC104 {
	public String replaceSpace(String s){
		char[] ca=s.toCharArray();
		int space=0,newlen=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				space++;
			}
		}
		newlen=s.length()+3*space;
		char[] newchar=new char[newlen];
		for(int j=newlen-1,i=s.length()-1;i>=0&&j>=0;i--){
			if(ca[i]==' '){
				newchar[j--]='0';
				newchar[j--]='2';
				newchar[j--]='%';
			}else{
				newchar[j--]=ca[i];
			}
		}
		return new String(newchar);
		
	}
	public static void main(String[] args) {
		System.out.println(new CC104().replaceSpace("hello world "));

	}

}
