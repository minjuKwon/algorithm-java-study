package kakao;

public class Kakao_2021_recommedID {

	public static void main(String[] args) {
		
		solution("...!@BaT#*..y.abcdefghijklm"	);

	}
	
	static public String solution(String new_id) {
        
        new_id= new_id.toLowerCase();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<new_id.length();i++){
            char ch= new_id.charAt(i);
            if(Character.isAlphabetic(ch)||
              Character.isDigit(ch)||
              ch=='-'||ch=='_'||ch=='.'){
                sb.append(ch);
            }
        }
        
        String answer = sb.toString();
        
        while(answer.indexOf("..")!=-1)
            answer= answer.replace("..",".");
        
        if(!answer.isEmpty()&&answer.charAt(0)=='.')
            answer= answer.substring(1);
        if(!answer.isEmpty()&&answer.charAt(answer.length()-1)=='.')
            answer= answer.substring(0, answer.length()-1);
        
        if(answer.isEmpty()) answer="a";
        
        if(answer.length()>15){
            answer= answer.substring(0,15);
            if(answer.charAt(answer.length()-1)=='.')
            answer= answer.substring(0, answer.length()-1);
        }
        
        while(answer.length()<3)
            answer+=answer.charAt(answer.length()-1);
        
        return answer;
    }

}
