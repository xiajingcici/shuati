package cc150;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class CC1002 {
	public void sort(String[] array){
		Hashtable<String,LinkedList<String>> h=new Hashtable<String,LinkedList<String>>();
		for(String s:array){
			String key=sortString(s);
			if(!h.containsKey(key)){
				h.put(key,new LinkedList<String>());
			}
			LinkedList<String> anagrams=h.get(key);
			System.out.println(anagrams);
			anagrams.push(s);
		}
		int index=0;
		for(String key:h.keySet()){		
			LinkedList<String> list=h.get(key);
			for(String t:list){
				array[index]=t;
				index++;
			}
		}	
	}
	String sortString(String s){
		char[] chararray=s.toCharArray();
		Arrays.sort(chararray);
		return new String(chararray);	
	}
	public int compare(String s1,String s2){
		return sortString(s1).compareTo(sortString(s2));
	}
	
	public static void main(String[] args) {
		CC1002 c2=new CC1002();
		String[] s={"hello","love","olleh","world"};
		c2.sort(s);
		for(String str:s){
			System.out.println(str);
		}
	}

}
