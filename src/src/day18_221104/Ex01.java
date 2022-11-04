/*
 	param 을 분리해서 ArrayList 에 담아서 출력하세요
 	ArrayList 에 ArrayList 가 들어있는 형태로 만드세요
 */

package day18_221104;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex01 {

	public Ex01() {
		StringBuffer buff = new StringBuffer("name=");
		buff.append("jennie");
		buff.append("&id=jennie");
		buff.append("&pw=12345");
		buff.append("&mail=jennie@githrd.com");
		String param = buff.toString();
		StringTokenizer token = new StringTokenizer(param, "&");
		int len1 = token.countTokens();
		ArrayList arrl = new ArrayList();
		while (token.hasMoreTokens()) {
			String subParam = token.nextToken();
			StringTokenizer tkn = new StringTokenizer(subParam, "=");
			ArrayList subArr = new ArrayList();
			while (tkn.hasMoreTokens()) {
				subArr.add(tkn.nextToken());
			}
			arrl.add(subArr);
		}
		for (Object obj : arrl) {
			System.out.println(obj.toString());
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
