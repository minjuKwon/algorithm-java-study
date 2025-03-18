package programmers;

public class ThreeDigitReversal {

	public static void main(String[] args) {
		
		int n=45;
		
		StringBuilder sb=new StringBuilder();
        
        while(n!=0){
            sb.append(n%3);
            n/=3;
        }
        
        System.out.println(Integer.parseInt(sb.toString(),3));

	}

}