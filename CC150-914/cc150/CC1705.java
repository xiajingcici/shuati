package cc150;

import java.util.Arrays;

public class CC1705 {
	public Result estimate(String guess,String solution){
		int hits=0;
		int psuedoHits=0;
		char[] nguess=new char[4];
		char[] nsolution=new char[4];
		int g=0,s=0;
		for(int i=0;i<4;i++){
			if(guess.charAt(i)==solution.charAt(i)){
				hits++;				
			}else{
				nguess[g++]=guess.charAt(i);
				nsolution[s++]=solution.charAt(s);
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(nguess[i]=='\0') break;
				if(nguess[i]==nsolution[j]){
					psuedoHits++;
				}
			}
		}
		return (new Result(hits,psuedoHits));
	}

	public static void main(String[] args) {
		CC1705 c=new CC1705();
		String guess="GGRR";
		String solution="RGBY";
		Result res=c.estimate(guess, solution);
		System.out.println(res);
	}

}
