package cc150;

public class CC1005 {
	public int search(String[] strs,String s){
		if(strs==null||s==null||s=="") return -1;
		return search(strs,s,0,strs.length-1);
	}

	private int search(String[] strs, String s, int first, int last) {
		int mid=(first+last)/2;
		if(strs[mid].isEmpty()){
			int left=mid-1,right=mid+1;
			while(true){
				if(left<first&&right>last){
					return -1;
				}
			}
		}
		
		
		return 0;
	}
}
