package cc150;

import java.util.ArrayList;

public class CC909 {
	int gridSize=8;
	void placeQueens(int row,Integer[] columns, ArrayList<Integer[]> results){
		if(row==gridSize){
			results.add(columns.clone());
		}else{
			for(int col=0;col<gridSize;col++){
				if(checkValid(columns,row,col)){
					
				}
			}
		}
	}
	public boolean checkValid(Integer[] columns,int row1,int column1){
		for(int row2=0;row2<row1;row2++){
			int column2=columns[row2];	
			if(column1==column2) return false;
			int columnDistance=Math.abs(column2-column1);
			
			int rowDistance=row1-row2;
			if(columnDistance==rowDistance) return false;

		}
		return true;
	}
	public void main(String args[]){
		CC909 c=new CC909();
	}
}
