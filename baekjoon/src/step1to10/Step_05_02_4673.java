package step1to10;

public class Step_05_02_4673 {

	public static void main(String[] args) {
		
		int num=0;
		boolean [] arr=new boolean[10001];
		for(int i=1;i<10001;i++) {
			num=dn(i);
			if(num<10001)
				arr[num]=true;
		}
		
		for(int j=1;j<arr.length;j++) {
			if(arr[j]==false)
				System.out.println(j);
		}
		
	}

	public static int dn(int number){
		int sum=number;
		
		while(number!=0) {
			sum+=number%10;
			number/=10;
		}
		
		return sum;
	}
        

}
