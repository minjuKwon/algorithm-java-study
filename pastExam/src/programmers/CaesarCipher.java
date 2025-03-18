package programmers;

public class CaesarCipher {

	public static void main(String[] args) {
		
		String s="AB";
		int n=1;
		
		StringBuilder sb=new StringBuilder();
        
        String [] arr=s.split("");
        
        for(String st:arr){
            if(st.equals(" ")) sb.append(" ");
            char str=st.charAt(0);
            if(str>='a'&&str<='z'){
               sb.append((char)((str+n-'a')%26+'a')); 
            } 
            else if(str>='A'&&str<='Z'){
                sb.append((char)((str+n-'A')%26+'A'));
            } 
        }
        
        System.out.println(sb.toString());

	}

}