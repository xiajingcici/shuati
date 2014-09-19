package july18;

public class SearchInRange {
    public int[] helper(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] result=new int[2];
        result[0]=-1; 
        result[1]=-1; 
        if(A.length==0) return result; 
        int low=0, high=A.length; //high is 1 more than the index
        while(low<high)
        {
            int mid=low+(high-low)/2;
            System.out.println(mid+"hello");
            if(A[mid]<target)
            {
                low=mid+1; 
            }else
            {
                high=mid-1; 
            }
        }
        System.out.println("high="+high+" low= "+low);
        if(low==A.length || A[low]!=target)
        {
           return result; 
        }
        result[0]=low;
        high=A.length; 
        while(low<high)
        {
            int mid=low+(high-low)/2;
            System.out.println("mid="+mid);
            if(A[mid]>target){
                high=mid-1; 
            }else{
                low=mid+1; 
            }
        }
        System.out.println("high1="+high+" low= "+low);
        result[1]=high-1;
        return result; 
    }
    public static void main(String args[]){
    	int[] A={1,2,3,4};
    	SearchInRange s=new SearchInRange();
    	int[] res=s.helper(A,1);
    	for(int i:res){
    		System.out.println(i);    		
    	}

    }	
	private static int halfSearch(int[] A, int target) {
		int start = 0;
		int end = A.length - 1;
		if (target == A[end])
			return end;
		if (target == A[start])
			return start;
		while (end > start + 1) {
			int middle = (start + end) / 2;
			if (target == A[middle])
				return middle;
			if (target < A[middle])
				end = middle;
			else
				start = middle;
		}
		return -1;
	}
    public int[] searchRange(int[] A, int target) {
        int index=halfSearch(A,target);
    	int[] res={-1,-1};
    	if(index==-1) return res;
    	int from=index,to=index;
    	while(from>=0&&A[from]==target){
    		res[0]=from;
    		from--;
    	}
    	while(to<A.length&&A[to]==target){
    		res[1]=to;
    		to++;
    	}
        return res;
    }

}
