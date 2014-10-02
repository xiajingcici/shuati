package cc150;

public class CC1702 {
	public char isWon(char[][] board){
		//check row
		for(int i=0;i<3;i++){
			if(board[i][0]!='\0'&&board[i][0]==board[i][1]&&board[i][0]==board[i][2]){
				return board[i][0];
			}
		}
		//check column
		for(int i=0;i<3;i++){
			if(board[0][i]!='\0'&&board[0][i]==board[1][i]&&board[0][i]==board[2][i]){
				return board[0][i];
			}
		}
		//check diagonal
		if(board[0][0]!='\0'&&board[0][0]==board[1][1]&&board[0][0]==board[2][2]){
			return board[0][0];
		}
		//check reverse diagonal
		if(board[0][2]!='\0'&&board[0][2]==board[1][1]&&board[0][2]==board[2][0]){
			return board[0][2];
		}
		return '\0';
	}
	//follow up
	public char isWon1(char[][] board){
		int len=board.length;
		int row=0,col=0;
		//check row
		for(row=0;row<len;row++){
			if(board[row][0]!='\0'){
				for(col=0;col<len;col++){
					if(board[row][0]!=board[row][col]) break;	
				}
				if(col==len) return board[row][0];
			}
		}
		//check col
		for(col=0;col<len;col++){
			if(board[0][col]!='\0'){
				for(row=0;row<len;row++){
					if(board[row][col]!=board[0][col]) break;
				}
				if(row==len) return board[0][col];
			}

		}
		//check diagonal
		if(board[0][0]!='\0'){
			for(int i=0;i<len;i++){
				if(board[0][0]==board[i][i]){
					return board[0][0];
				}
			}		
		}
		//check reverse diagonal
		if(board[0][len-1]!='\0'){
			for(int i=0,j=len-1;i<len&&j>=0;i++,j--){
				if(board[0][len-1]==board[i][j]){
					return board[0][len-1];
				}
			}		
		}
		
		return '\0';
	}

	public static void main(String args[]){
		char board[][]={{'\0','\0','\0','\0'},{'x','x','\0','x'},{'o','o','o','o'},{'o','o','o','o'}};
		char c=new CC1702().isWon1(board);
		System.out.println(c);

	}
}
