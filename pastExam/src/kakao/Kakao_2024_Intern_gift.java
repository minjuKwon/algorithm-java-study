package kakao;

import java.util.HashMap;

public class Kakao_2024_Intern_gift {

	public static void main(String[] args) {
		String [] f={"muzi", "ryan", "frodo", "neo"};
		String [] g= {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		System.out.println(solution(f,g));
	}
	
    static int solution(String[] friends, String[] gifts) {
        
        int answer = 0;
        int friendsLen=friends.length;
        
        HashMap<String,Integer> map=new HashMap<>();
        int [][] giftTable=new int[friendsLen][friendsLen];
        int [] giftDegree=new int[friendsLen];
        
        for(int i=0;i<friendsLen;i++){
            map.put(friends[i],i);
        }
        
        for(String g:gifts){
            String [] names=g.split(" ");
            giftDegree[map.get(names[0])]++;
            giftDegree[map.get(names[1])]--;
            giftTable[map.get(names[0])][map.get(names[1])]++;
        }
        
        for(int i=0;i<friendsLen;i++){
            int temp=0;
            for(int j=0;j<friendsLen;j++){
                if(i==j) continue;
                if(giftTable[i][j]>giftTable[j][i]||(giftTable[i][j]==giftTable[j][i]&&giftDegree[i]>giftDegree[j])){
                    temp++;
                }
            }
            if(temp>answer) answer=temp;
        }
        
        return answer;
        
    }
    
}
