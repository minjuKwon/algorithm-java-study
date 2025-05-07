package programmers;

public class TheNextNumber {

	public static void main(String[] args) {

		int[] common= {1, 2, 3, 4};
		
		int num1=common[1]-common[0];
        int num2=common[2]-common[1];
        
        int answer = 0;
        int len=common.length;
        
        if (num1==num2){
            answer= common[len-1]+num1;    
        }else{
            answer= common[len-1]*(num2/num1);
        }
        
        System.out.println(answer);

	}

}