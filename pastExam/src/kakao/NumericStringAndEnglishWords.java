package kakao;

public class NumericStringAndEnglishWords {

	public static void main(String[] args) {
		
		String s="one4seveneight";
		
		String [] num={"zero","one","two","three","four","five","six",
                "seven","eight","nine"};
  
		  for(int i=0;i<10;i++){
		      s=s.replace(num[i],String.valueOf(i));
		  }
		  
		  System.out.println(Integer.parseInt(s));

	}

}