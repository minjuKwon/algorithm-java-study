
public class RankAlgorithm {

	public static void main(String[] args) {
		
		int[]scores= {90,87,100,95,80};
		int[]rankings= {1,1,1,1,1};
		
		for(int i=0;i<scores.length;i++) {
			rankings[i]=1;
			for(int j=0;j<scores.length;j++) {
				if(scores[i]<scores[j])
					rankings[i]++;
			}
		}
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(String.format("%3d점 : %1d등", scores[i],rankings[i]));
		}

	}

}
