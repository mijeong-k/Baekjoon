package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			String line = br.readLine();
			int n = Integer.parseInt(line);
			QueueMake q = new QueueMake(n);
			
			for(int i =0; i<n; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
//				System.out.println(st.countTokens());
				
				String cmd = "";
				String value = "";
				if(st.countTokens()==2) {
					cmd = st.nextToken();
					value = st.nextToken();
//					System.out.println(cmd + ":" +value);
				}else {
					cmd=st.nextToken();
				}
				
				switch(cmd) {
					case "push" :
//						System.out.println("push");
						int v = Integer.parseInt(value);
						q.push(v);
						break;
					case "pop" :
						System.out.println("pop");
						break;
					case "front" :
						q.front();
						break;	
					case "back" :
						q.back();
						break;	
					case "size" :
						q.size();
						break;	
					case "empty" :
						q.empty();
						break;								
				}
				
				
				
			}					

		} catch (IOException e) {
			e.printStackTrace();
		}		
		

	}

}
