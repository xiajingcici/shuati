package oct2;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
	public ArrayList<ArrayList<String>> partition(String s){
		ArrayList<ArrayList<String>> results=new ArrayList<ArrayList<String>>();
		ArrayList<String> subres=new ArrayList<String>();
		if(s==null||s.length()==0) return results;
		helper(results,subres,s);		
		return results;
	}
	public void helper(ArrayList<ArrayList<String>> results, ArrayList<String> subres, String str){
		System.out.println("str= "+str);
		if(str.length()==0){
			results.add(new ArrayList<String>(subres));
			System.out.println("results= "+results);
		}
		int len=str.length();
		for(int i=1;i<=len;i++){
			String sub1=str.substring(0,i);
			if(isPalindrome(sub1)){
				subres.add(sub1);
				System.out.println(i+":"+subres);
				String sub2=str.substring(i);
				System.out.println("strXsub1Xin= "+sub1);
				System.out.println("strXsub2Xin= "+sub2);
				System.out.println("strXXXin= "+str);
				helper(results,subres,sub2);
				System.out.println("strXsub1Xout= "+sub1);
				System.out.println("strXsub2Xout= "+sub2);
				System.out.println("strXXXout= "+str);
				System.out.println("before remvoe="+subres);
				subres.remove(subres.size()-1);
				System.out.println("after="+subres);
				System.out.println("str finished= "+str);
			}
		}
	}
	public boolean isPalindrome(String s){
		if(s.length()==0||s.length()==1) return true;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		PalindromePartition p= new PalindromePartition();
		System.out.println(p.partition("abab"));

	}

}
