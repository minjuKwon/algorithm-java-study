package programmers;

public class CreateStrangString {

	public static void main(String[] args) {
		
		String s=" try hello world ";
		
		String [] temp=s.split("");
        StringBuilder sb=new StringBuilder();
        
        int idx=-1;
        for(String str:temp){
            idx= str.equals(" ")? -1 : idx+1;
            sb.append(idx%2==0?str.toUpperCase():str.toLowerCase());
        }
        
        String answer = sb.toString();
        System.out.println(answer);

	}

}