package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack2_3015 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		long count=0;
		Stack<Person> stack=new Stack<>();
		
		for(int i=0;i<N;i++) {
			
			int line=Integer.parseInt(br.readLine());
			Person person=new Person(line,1);
			
			while(!stack.isEmpty()&&line>=stack.peek().height) {
				Person pop=stack.pop();
				count+=pop.count;
				if(line==pop.height) {
					person.count+=pop.count;
				}
			}
			
			if(!stack.isEmpty()) {
				count++;
			}
			
			stack.push(person);
			
		}
		
		br.close();
		
		System.out.println(count);

	}

}

class Person{
	int height,count;
	public Person(int height, int count) {
		this.height=height;
		this.count=count;
	}
}
