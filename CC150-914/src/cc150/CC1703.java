package cc150;

public class CC1703 {
	public int countZero(int num){
		if(num<0) return -1;
		int count=num/5;
		return count;
	}
	public int countZero1(int num){
		int count=0;
		if(num<0) return -1;
		for(int i=5;num/i>0;i*=5){
			count+=num/i;
		}
		return count;
	}
	public static void main(String args[]){
		CC1703 c=new CC1703();
		System.out.println(c.countZero1(19));
	}
}
