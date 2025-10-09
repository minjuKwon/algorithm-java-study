package kakao;

import java.util.HashMap;

public class Kakao_2018_cache {

	public static void main(String[] args) {
		
		int size=3;
		String [] cities= {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		
		solution(size, cities);

	}
	
	static public int solution(int cacheSize, String[] cities) {
        
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<cities.length;i++){
            String city= cities[i].toLowerCase();
            if(map.size()<=cacheSize&&map.containsKey(city)){
                answer+=1;
                map.replace(city, i);
            }else{
                if(map.size()>=cacheSize){
                    int minValue=100001;
                    String minKey="";
                    for(String key:map.keySet()){
                        if(map.get(key)<minValue){
                            minKey=key;
                            minValue=map.get(key);
                        } 
                    }
                    map.remove(minKey);   
                }
         
                map.put(city, i);
                answer+=5;
            }
        }
        
        return answer;
    }

}
