package programmers;

import java.util.HashMap;
import java.util.Map;

public class Clothes {

	public static void main(String[] args) {

		String[][] clothes= {
				{"yellow_hat", "headgear"}, 
				{"blue_sunglasses", "eyewear"}, 
				{"green_turban", "headgear"}
				};
		
		Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            String kind=clothes[i][1];
            map.put(kind, map.getOrDefault(kind,0)+1);
        }
        
        int answer = 1;
        for(String key:map.keySet()){
            answer*=(map.get(key)+1);
        }
        
        System.out.println(answer-1);

	}

}