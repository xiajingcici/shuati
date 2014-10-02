package july18;

public class CC301 {

		int stackSize=100;
		int[] buffer=new int[stackSize*3];
		int[] stackPointer={0,0,0};
	
		void push(int stackNum, int value) throws Exception{
			if(stackPointer[stackNum]>=stackSize){
				throw new Exception("Out of Space.");
			}
			int index=stackNum*stackSize+stackPointer[stackNum]+1;
			stackPointer[stackNum]++;
			buffer[index]=value;
		}
		int pop(int stackNum) throws Exception{
			if(stackPointer[stackNum]==0){
				throw new Exception("Trying to pop an empty stack");
			}
			int index=stackNum*stackSize+stackPointer[stackNum];
			stackPointer[stackNum]--;
			int value=buffer[index];
			buffer[index]=0;
			return value;
		}
		int peek(int stackNum){
			int index=stackNum*stackSize+stackPointer[stackNum];
			return buffer[index];
		}
		boolean isEmpty(int stackNum){
			return stackPointer[stackNum]==0;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
