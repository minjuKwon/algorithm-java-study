package programmers;

public class OverPainting {

	public static void main(String[] args) {
		
		int n=8;
		int m=4;
		int[] section= {2, 3, 6};
		
		int answer = 1;
        int paintedIdx=section[0];
        
        for(int i=1;i<section.length;i++){
            if(section[i]>paintedIdx+m-1){
                answer++;
                paintedIdx=section[i];
            }
        }
        
        System.out.println(answer);

	}

}