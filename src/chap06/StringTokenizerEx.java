package chap06;

import java.util.StringTokenizer;
public class StringTokenizerEx {
	public static void main(String[] args) {
//		String query = "name=kitae&addr=seoul&age=21";
//		StringTokenizer st = new StringTokenizer(query, "&");
//
//		int n = st.countTokens(); // 분리된 토큰 개수
//		System.out.println("토큰 개수 = " + n);
//		while(st.hasMoreTokens()) { // for(int i=0; i<n; i++)와 동일
//			String token = st.nextToken(); // 토큰 얻기
//			System.out.println(token); // 토큰 출력
//		}

		for (int i=0; i<5; i++){
			System.out.print((int)(Math.random()*45 + 1) + " "); // 난수 발생
		}

		String str = "123   ";

		System.out.println(str.equals("123"));
	}
}