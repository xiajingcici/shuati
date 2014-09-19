package july18;

public class CC106 {
	public int[][] rotate(int[][] matrix){
		int len=matrix.length;
		int[][] res=new int[len][len];
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				res[i][j]=matrix[len-1-j][i];
			}
		}
		return res;
	}
	public static void main(String args[]){
		int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
		int[][] res=new CC106().rotate(matrix);
		for(int[] m:res){
			for(int i:m){
				System.out.println(i);
			}
		}
	}
}
