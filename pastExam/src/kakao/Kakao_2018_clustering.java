package kakao;

import java.util.ArrayList;

public class Kakao_2018_clustering {

	public static void main(String[] args) {
		
		solution("FRANCE",	"french");

	}
	
	static public int solution(String str1, String str2) {
        
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        
        ArrayList<String> list1= new ArrayList<>();
        ArrayList<String> list2= new ArrayList<>();
        
        for(int i=0;i<str1.length()-1;i++){
            char ch1= str1.charAt(i);
            char ch2= str1.charAt(i+1);
            if(Character.isAlphabetic(ch1)&&Character.isAlphabetic(ch2)){
                String temp= "";
                temp+=ch1;
                temp+=ch2;
                list1.add(temp);
            }
        }
        
        for(int i=0;i<str2.length()-1;i++){
            char ch1= str2.charAt(i);
            char ch2= str2.charAt(i+1);
            if(Character.isAlphabetic(ch1)&&Character.isAlphabetic(ch2)){
                String temp= "";
                temp+=ch1;
                temp+=ch2;
                list2.add(temp);
            }
        }
        
        ArrayList<String> union= new ArrayList<>();
        ArrayList<String> intersection= new ArrayList<>();
        
        for(String s:list1){
            if(list2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }
        
        for(String s:list2){
            union.add(s);
        }
        
        double answer = 0;
        if(union.size()==0){
            answer=1;
        }else{
            answer= (double)intersection.size()/union.size();
        }
        
        return (int)(answer*65536);
    }

}