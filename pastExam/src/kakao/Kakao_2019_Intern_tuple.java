package kakao;

import java.util.Arrays;
import java.util.Comparator;

public class Kakao_2019_Intern_tuple {

	public static void main(String[] args) {
		
		solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
		
	}
	
	static public int[] solution(String s) {
        
        s=s.substring(1, s.length()-1);
        String [] arr=s.split("},");
        
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            str=str.replace("{","");
            str=str.replace("}","");
            arr[i]=str;
        }
        
        Arrays.sort(arr, new Comparator<String>(){
           public int compare(String s1, String s2){
               return s1.length()-s2.length();
           }
        });
        
        String strLast= arr[arr.length-1];
        String [] last= strLast.split(",");
        
        int[] answer = new int[last.length];
        
        String strFirst=arr[0];
        int pre=Integer.parseInt(strFirst);
        answer[0]= pre;
        
        int idx= 1;
        for(int i=1;i<arr.length;i++){
            String [] tempArr= arr[i].split(",");
            int sum=0;
            for(int j=0;j<tempArr.length;j++){
                sum+=Integer.parseInt(tempArr[j]);
            }
            answer[idx++]=sum-pre;
            pre=sum;
        }
        
        return answer;
    }

}
