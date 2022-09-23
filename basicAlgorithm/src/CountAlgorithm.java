
public class CountAlgorithm {

	public static void main(String[] args) {
		
		int [] numbers= {11,12,13,13,15,13};
		int count=0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%13==0) {
				count+=1;
			}
		}
		System.out.println(numbers.length+"개의 정수 중 13의 배수의 개수 : "+count);

	}

}
