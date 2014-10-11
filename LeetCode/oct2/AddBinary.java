package oct2;

public class AddBinary {
    public String addBinary(String a, String b) {
        String result="";
        int len=Math.max(a.length(),b.length());
        int carry=0;
        for(int i=0;i<len;i++){

            int x=((a.length()-1-i)>=0)?Integer.valueOf((a.charAt(a.length()-1-i)))-48:0;
            int y=((b.length()-1-i)>=0)?Integer.valueOf((b.charAt(b.length()-1-i)))-48:0;
            System.out.println(x+" x:y "+y);
            int temp=(x+y+carry)%2;
            result=temp+result;
            carry=(x+y+carry)/2;
        }
        System.out.println(carry+" result "+result);
        
        if(carry==1) result="1"+result;
        return result;
    }
	public static void main(String args[]){
		String result=new AddBinary().addBinary("1010", "1011");
		System.out.println(result);

	}
}
