package programmers;

public class Trio {
	
	static int count=0;
    static boolean [] visited;

	public static void main(String[] args) {
		
		int[] number= {-2, 3, 0, 2, -5};
		
		visited=new boolean[number.length];
        f(0,0,0,number);
        
        System.out.println(count);
        
	}
	
	static public void f(int depth, int idx, int sum, int [] arr){
		
        if(depth==3){
            if(sum==0) count++;
        }
        
        for(int i=idx;i<arr.length;i++){
            if(!visited[i]){
                visited[i]=true;
                f(depth+1,i,sum+arr[i],arr);
                visited[i]=false;
            }
        }
        
    }

}