package cc150;

public class CC1001 {
	public void merge(int A[],int B[],int numA,int numB){
		int Alast=numA-1;
		int Blast=numB-1;
		int cur=numA+numB-1;
		while(Alast>=0&&Blast>=0){
			
			if(A[Alast]>B[Blast]){
				A[cur]=A[Alast];
				Alast--;
			}else{
				A[cur]=B[Blast];
				Blast--;
			}
			cur--;
		}
		while(Blast>=0){
			A[cur]=B[Blast];
			cur--;
			Blast--;
		}
	}
	public static void main(String[] args) {
		CC1001 c=new CC1001();
		int a[]={2,5,6,7,0,0,0,0};
		int b[]={0,1,3,4};
		c.merge(a,b,4,4);
		for(int i:a){
			System.out.println(i);
		}
		

	}

}
