package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class CustomSortString {

	public static void main(String[] args) {
		
		int n=1;
		String[] strings= {"sun", "bed", "car"};
		
		 Arrays.sort(strings, new Comparator<String>(){
	           public int compare(String s1, String s2){
	               char ch1= s1.charAt(n);
	               char ch2= s2.charAt(n);
	               if(ch1==ch2){
	                   return s1.compareTo(s2);
	               }else if(ch1>ch2){
	                   return 1;
	               }
	               return -1;
	           } 
	        });
		 
		 System.out.println(Arrays.toString(strings));
		
	}

}