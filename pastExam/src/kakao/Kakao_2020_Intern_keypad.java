package kakao;

import java.util.HashMap;

public class Kakao_2020_Intern_keypad {

	public static void main(String[] args) {
		
		int [] numbers= {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand="right";
		
		solution(numbers, hand);

	}
	
	static public String solution(int[] numbers, String hand) {
        StringBuilder sb=new StringBuilder();
        
        HashMap<Integer, Integer> xPosition= new HashMap<>();
        HashMap<Integer, Integer> yPosition= new HashMap<>();
    
        int idx=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                xPosition.put(idx, i);
                yPosition.put(idx, j);
                idx++;
            }
        }
        
        xPosition.put(0,3);
        yPosition.put(0,1);
        
        int xLeft=3;
        int yLeft=0;
        int xRight=3;
        int yRight=2;
        
        for(int num:numbers){
            if(num==1||num==4||num==7){
                xLeft=xPosition.get(num);
                yLeft=yPosition.get(num);
                sb.append("L");
            }else if(num==3||num==6||num==9){
                xRight=xPosition.get(num);
                yRight= yPosition.get(num);
                sb.append("R");
            }else{
                int currentX= xPosition.get(num);
                int currentY= yPosition.get(num);
                
                int left= Math.abs(currentX-xLeft)+Math.abs(currentY-yLeft);
                int right= Math.abs(currentX-xRight)+Math.abs(currentY-yRight);
                
                if(left<right){
                    sb.append("L");
                    xLeft=currentX;
                    yLeft=currentY;
                }else if(left>right){
                    xRight=currentX;
                    yRight=currentY;
                    sb.append("R");
                }else{
                    if(hand.equals("right")){
                    xRight=currentX;
                    yRight=currentY;
                    sb.append("R");
                }else{
                    sb.append("L");
                    xLeft=currentX;
                    yLeft=currentY;
                    }
                }
            }
        }
        
        return sb.toString();
    }

}
