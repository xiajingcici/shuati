package cc150;

public class CC1704 {
	public int findMax(int a,int b){
		int c=a-b;
		int sa=sign(a);
		int sb=sign(b);
		int sc=sign(c);
		int use_sign_of_a=sa^sb;
		int use_sign_of_c=flip(sa^sb);
		int k=use_sign_of_a*sa+use_sign_of_c*sc;
		int q=flip(k);
		int res=a*k+b*q;
		return res;
	}
	private int sign(int a) {
		int sign=flip((a>>31)&0*1);
		System.out.println("sign="+sign);
		return sign;
	}
	private int flip(int k) {
		// TODO Auto-generated method stub
		int flip=1^k;
		System.out.println("flip="+flip);
		return flip;
	}
	public static void main(String args[]){
		CC1704 c=new CC1704();
		int x=1,y=5;
		System.out.println(c.findMax(1, 5));
	}
}
