package oct2;

public class JumpGame {
    public boolean canJump(int[] A) {  
        int [] state = new int[A.length];
        state[0] = A[0];
        if(state[0]==0&&A.length>1) {
            return false;
        }
        for(int i=1;i<A.length;i++) {
            state[i] = Math.max(state[i-1],A[i] + i);
            if(state[i]<=i&&i!=A.length-1) {
            	System.out.println(state[i]+":"+i);
                return false;
            }
        }
        return true;
	}

    	
	public static void main(String[] args) {
		JumpGame jg=new JumpGame();
		int[] A={1,1,2};
		boolean b=jg.canJump(A);
		System.out.println(b);

	}

}
