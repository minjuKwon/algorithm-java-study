package kakao;

import java.util.Arrays;

public class Kakao_2018_secretMap {

	public static void main(String[] args) {
		
		int n=5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};

        String[] answer = new String[n];
        
        for(int i=0;i<n;i++){
            int operation= arr1[i]|arr2[i];
            StringBuilder sb = new StringBuilder();

            for(int j=n-1;j>=0;j--){
                sb.append((operation&(1<<j))!=0?'#':' ');
            }
            answer[i]=sb.toString();
        }
        
        System.out.println(Arrays.toString(answer));

	}

}