
public class SortAlgorithm {

	public static void main(String[] args) {
		
		int []data= {3,2,1,5,4};
		int N=data.length;
		
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(data[i]>data[j]) {
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		for(int i=0;i<N;i++)
			System.out.print(data[i]+" ");
		
	}

}
