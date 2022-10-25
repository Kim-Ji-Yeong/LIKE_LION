package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAJ4796 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		if(L == 0 && P == 0 && V ==0) break;
		int result = L * (V/P) +Math.min(L, V%P);
		
		System.out.println("Case " + i + ": " + result);
		i++;
		}
	}
}