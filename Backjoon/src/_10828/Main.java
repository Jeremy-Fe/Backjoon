package _10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int repeat = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < repeat; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
	        String order = st.nextToken();
			switch(order) {
			case "push" : 
				int x = Integer.parseInt(st.nextToken());
				stack.push(x);
				break;
			case "pop" :
				if(stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
				break;
			case "size" :
				System.out.println(stack.size());
				break;
			case "empty" : 
				if(stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "top" :
				if(stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
				break;
			default :
				continue;
			}
		}
		
	}
}
