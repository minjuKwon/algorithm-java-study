package programmers;

public class SmallerSubstring {

	public static void main(String[] args) {
		
		String t="3141592";
		String p="271";
        int answer = 0;
        int len=p.length();
        
        for(int i=0;i<=t.length()-len;i++){
            String temp=t.substring(i,i+len);
            if(Long.parseLong(p)>=Long.parseLong(temp)){
                answer++;
            }
        }
        
        System.out.println(answer);

	}

}
