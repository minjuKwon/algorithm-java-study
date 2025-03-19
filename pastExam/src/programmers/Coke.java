package programmers;

public class Coke {

	public static void main(String[] args) {
		
		int a=2;
		int b=1;
		int n=20;
		
		int answer = 0;
		 
        while(n>=a){
            answer+= (n/a)*b;
            n= (n/a)*b+(n%a);
        }
        
        System.out.println(answer);

	}

}