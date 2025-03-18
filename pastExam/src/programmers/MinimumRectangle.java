package programmers;

public class MinimumRectangle {

	public static void main(String[] args) {
		
		int[][] sizes= {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		int width=0;
        int height=0;
        
        for(int [] arr:sizes){
            width=Math.max(width, Math.max(arr[0],arr[1]));
            height=Math.max(height, Math.min(arr[0],arr[1]));
        }
        
        System.out.println(width*height);

	}

}