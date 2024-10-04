package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kakao_2022_report {

	public static void main(String[] args) {
		String [] id= {"muzi", "frodo", "apeach", "neo"};
		String [] report= {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k=2;
		System.out.println(Arrays.toString(solution(id,report,k)));
	}
	
	static int[] solution(String[] id_list, String[] report, int k) {
        
        int idLen=id_list.length;
        Map<String,Integer> map=new HashMap<>();
        int [][] arr=new int[idLen][idLen];
        
        //id 구별 map 생성
        for(int i=0;i<idLen;i++){
            map.put(id_list[i],i);
        }
        
        //신고 관계 2차 배열 생성
        for(int i=0;i<report.length;i++){
            String [] p=report[i].split(" ");
            if(arr[map.get(p[0])][map.get(p[1])]>0) continue;
            arr[map.get(p[0])][map.get(p[1])]=1;
        }
        
        //k이상 신고 받은 사람 list에 담기
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<idLen;i++){
            int sum=0;
            for(int j=0;j<idLen;j++){
                sum+=arr[j][i];
            }
            if(sum>=k){
                list.add(i);
            }
        }
        
        //결과 도출
        int[] answer = new int[idLen];
        for(int i=0;i<idLen;i++){
            for(int l:list){
                if(arr[i][l]>0){
                    answer[i]++;
                }
            }
        }
        
        return answer;
        
    }

}
