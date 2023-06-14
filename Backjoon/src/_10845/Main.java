package _10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		WCQueue Q = new WCQueue();
		
		int repeat = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < repeat; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
	        String order = st.nextToken();
	        
	        switch(order) {
			case "push" :
				Q.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				sb.append(Q.pop()).append("\n");
				break;
			case "size" :
				sb.append(Q.size()).append("\n");
				break;
			case "empty" :
				sb.append(Q.empty()).append("\n");
				break;
			case "front" :
				sb.append(Q.front()).append("\n");
				break;
			case "back" :
				sb.append(Q.back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}

}
