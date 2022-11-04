package day18_221104;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test01 {

	public Test01() {
		StringBuffer buff = new StringBuffer("name="); 
		buff.append("jennie");
		buff.append("&id=jennie");
		buff.append("&pw=12345");
		buff.append("&mail=jennie@githrd.com");
		
		String param = buff.toString();
		System.out.println(param);
		
		StringTokenizer token = new StringTokenizer(param, "&");
		int len = token.countTokens();
		String[] arr = new String[len];
		int i = 0;
		while(token.hasMoreElements()) {
			/*
			Object o = token.nextElement();
			arr[i++] = (String) o;
			*/
			arr[i++] = token.nextToken();
		}
		//System.out.println(Arrays.toString(arr));
		
		String[][] arrTwoDim = new String[arr.length][];
		for(i = 0; i < arr.length; i++) {
			StringTokenizer token2 = new StringTokenizer(arr[i], "=");
			// 아래 for 문의 계속조건에 2가 아니라 token2.countTokens() 쓰면 null.
			// 왜? for 문의 계속조건은 매 루프마다 다시 평가되기 때문에
			// token2.countTokens() 를 두번이상 실행하게 되어서
			// 임시 버퍼에 저장된 값이 사라짐.
			int leng = token2.countTokens();
			arrTwoDim[i] = new String[leng];
			for(int j = 0; j < leng; j++) {
				arrTwoDim[i][j] = token2.nextToken();
			}
			System.out.println(Arrays.toString(arrTwoDim[i]));
			
		}
		
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
