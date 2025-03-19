package programmers;

public class KnightWeapon {

	public static void main(String[] args) {
		
		int number=5;
		int limit=3;
		int power=2;
		
		int [] count=new int[number];
        for(int i=1;i<=number;i++){
            count[i-1]= get(i);
        }
       
        int answer = 0;
        for(int value:count){
            if(value>limit){
                answer+=power;
            }else{
                answer+=value;
            }
        }
        
        System.out.println(answer);

	}
	
	static int get(int num){
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0) {
                count++;
                if(i != num/i){
                    count++;
                }
            }
        }
        return count;
    }

}