package kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kakao_2019_failureRate {

	public static void main(String[] args) {
		
		solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3} );

	}
	
	static public int[] solution(int N, int[] stages) {
	        
	        int [] count=new int[N+1];
	        
	        int len= stages.length;
	        for(int stage:stages){
	            if(stage>N) continue;
	            count[stage]++;
	        }
	        
	        int user=len;
	        HashMap<Integer, Double> map = new HashMap<>();
	        for(int i=1;i<=N;i++){
	            if(count[i]==0) map.put(i, 0.0);
	            else map.put(i, (double)count[i]/(double)user);
	            user-=count[i];
	        }
	        
	        List<Integer> list = new ArrayList<>(map.keySet());
	        list.sort((o1,o2)->Double.compare(map.get(o2), map.get(o1)));
	        
	        return list.stream().mapToInt(i->i).toArray();
	    }

}
