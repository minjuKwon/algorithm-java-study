package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step_10_11_10814_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		Person[] arr=new Person[N];
		for(int i=0;i<arr.length;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int age=Integer.parseInt(st.nextToken());
			String name=st.nextToken();
			arr[i]=new Person(age,name);
		}
		
		Arrays.sort(arr,(e1,e2)->{
			return e1.getAge()-e2.getAge();
		});
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++)
			sb.append(arr[i]);
		System.out.println(sb);

	}

	public static class Person{
		int age;
		String name;
		
		public int getAge() {
			return age;
		}
		public String getName() {
			return name;
		}
		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		@Override
		public String toString() {
			return age+" "+name+"\n";
		}		
		
	}
	
}

