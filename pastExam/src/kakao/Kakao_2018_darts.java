package kakao;

public class Kakao_2018_darts {

	public static void main(String[] args) {
		solution("1S2D*3T");
	}
	
	public static int solution(String dartResult) {
	        
	        int idx=-1;
	        int num=0;
	        int [] operation=new int[3];
	        char [] ch= dartResult.toCharArray();
	        
	        for(int i=0;i<ch.length;i++){
	            if(ch[i]-'0'>=0&&ch[i]-'0'<=9){
	                idx++;
	                if(i!=0&&ch[i]-'0'==0&&ch[i-1]=='1'){
	                    num=10;
	                    idx--;
	                }else num=ch[i]-'0';
	            }else if(ch[i]=='S'){
	                if(num==0) operation[idx]=0;
	                else operation[idx]=num;
	            }else if(ch[i]=='D'){
	                if(num==0) operation[idx]=0;
	                else operation[idx]=(int)Math.pow(num,2);
	            }else if(ch[i]=='T'){
	                if(num==0) operation[idx]=0;
	                else operation[idx]=(int)Math.pow(num,3);
	            }else if(ch[i]=='*'){
	                if(idx==0) operation[0]*=2;
	                else{
	                    operation[idx-1]*=2;
	                    operation[idx]*=2;
	                }
	            }else if(ch[i]=='#'){
	                if(idx==0) operation[0]*=-1;
	                else{
	                    operation[idx]*=-1;
	                }
	            }
	        }
	        
	        int answer = 0;
	        for(Integer value:operation) {
	            answer+=value;   
	        }
	        
	        return answer;
	    }
}
