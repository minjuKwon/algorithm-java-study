package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Step_Stack2_05_3015 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());

		Stack<Person>stack=new Stack<>();
		long count=0;
		
		for(int i=0;i<N;i++) {
			
			int line=Integer.parseInt(br.readLine());
			Person p=new Person(line,1);
			
			while(!stack.isEmpty()&&line>=stack.peek().height) {
				Person pop=stack.pop();
				count+=pop.cnt;
				if(pop.height==line) {
					p.cnt+=pop.cnt;
				}
			}
			
			if(!stack.empty()) {
				count++;
			}
			
			stack.push(p);
			
		}
		
		br.close();
		
		System.out.println(count);

	}

}

class Person{
	
	int height,cnt;
	
	public Person(int height,int cnt) {
		this.height=height;
		this.cnt=cnt;
	}
	
}
