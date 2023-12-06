package step31to40;
//https://dev-sheep.tistory.com/64
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Dp3_04_1086 {

	static int N,K, maxBitmasking;
	static String [] input;
	static long [][] dp;
	static int [][] mods;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		maxBitmasking=(1<<N)-1;
		
		input=new String[N];
		for(int i=0;i<N;i++) {
			input[i]=br.readLine();
		}
		
		K=Integer.parseInt(br.readLine());
		
		dp=new long[K][1<<N];
		mods=new int[K][N];
		
		br.close();
		
		for(int i=0;i<K;i++) {
			for(int j=0;j<=maxBitmasking;j++) {
				dp[i][j]=-1;
			}
			for(int j=0;j<N;j++) {
				mods[i][j]=-1;
			}
		}
		
		long answer=dp(0,0);
		
		if(answer==0) {
			System.out.println("0/1");
		}else {
			long factorial=1;
			for(int i=2;i<=N;i++) {
				factorial*=i;
			}
			long gcd=getGcd(factorial, answer);
			System.out.println(answer/gcd+"/"+factorial/gcd);
		}

	}
	
	static long dp(int mod, int masking) {
		
		if(dp[mod][masking]!=-1) return dp[mod][masking];
		
		if(masking==maxBitmasking) return mod==0?1:0;
		
		long count=0;
		
		for(int i=0;i<N;i++) {
			int idx=1<<i;
			if((masking&idx)==0) {
				count+=dp(getMod(mod, i), masking|idx);
			}
		}
		
		return dp[mod][masking]=count;
		
	}
	
	static int getMod(int mod, int idx) {
		
		if(mods[mod][idx]!=-1) return mods[mod][idx];
		
		int temp=mod;
		int len=input[idx].length();
		
		for(int i=0;i<len;i++) {
			temp*=10;
			temp+=input[idx].charAt(i)-'0';
			temp%=K;
		}
		
		return mods[mod][idx]=temp;
		
	}
	
	static long getGcd(long a, long b) {
		if(b==0) return a;
		return getGcd(b, a%b);
	}

}
