/*
	1. blackpink 멤버들의 
		이름을 기억할 ArrayList names 를 만들고 데이터를 추가
		아이디를 기억할 ArrayList ids 를 만들고 데이터를 추가
		메일을 기억할 ArrayList mails 를 만들고 데이터를 추가 하세요
	2. 위 문항에서 완성한 ArrayList 에서 데이터를 추출해서 각 멤버별
		ArrayList 를 완성하세요
	3. 위 문항에서 완성한 ArrayList 를 기억할 ArrayList blackpink 를 
		완성하세요. 결과도 출력하세요
	----------------------------------------------------------------
	2 - 1.
		멤버 한명의 데이터를 기억할 VO BlackPink 를 만들고
		1번 문항에서 완성한 ArrayList 에서 데이터를 추출해서 채워넣고
		네 명의 데이터를 기억할 ArrayList 에 기억시키세요
		결과도 출력하세요
 */
package day19_221107;
import java.util.ArrayList;
import java.util.Iterator;
public class Ex00 {

	public Ex00() {
		ArrayList<String> names = new ArrayList();
		ArrayList<String> ids = new ArrayList();
		ArrayList<String> mails = new ArrayList();
		
		//  #1  ///////////////////////////////////////////
		System.out.println("#1--------------------\n");
		// names 채우기
		names.add("jisoo");
		names.add("jennie");
		names.add("rose");
		names.add("lisa");
		
		// names 출력
		System.out.println("blackpink members:");
		for(Object name : names) {
			System.out.println(name.toString());
		}
		System.out.println();
		
		// ids 채우기
		Iterator<String> nameItr = names.iterator();
		while(nameItr.hasNext()) {
			ids.add(nameItr.next());
		}
		
		// ids 출력
		System.out.println("ids:");
		for(Object id : ids) {
			System.out.println(id.toString());
		}
		System.out.println();
		
		// mails 채우기
		Iterator<String> mailItr = names.iterator();
		while(mailItr.hasNext()) {
			mails.add(mailItr.next()+ "@githrd.com");
		}
		
		// mails 출력
		System.out.println("mails:");
		for(Object mail : mails) {
			System.out.println(mail.toString());
		}
		System.out.println();
		
		//  #2  ///////////////////////////////////////////
		System.out.println("#2--------------------\n");
		ArrayList<String> jisoo = new ArrayList();
		ArrayList<String> jennie = new ArrayList();
		ArrayList<String> rose = new ArrayList();
		ArrayList<String> lisa = new ArrayList();
		
		jisoo.add(names.get(0));
		jisoo.add(ids.get(0));
		jisoo.add(mails.get(0));
		
		jennie.add(names.get(1));
		jennie.add(ids.get(1));
		jennie.add(mails.get(1));
		
		rose.add(names.get(2));
		rose.add(ids.get(2));
		rose.add(mails.get(2));
		
		lisa.add(names.get(3));
		lisa.add(ids.get(3));
		lisa.add(mails.get(3));
		
		toPrintMember(jisoo);
		toPrintMember(jennie);
		toPrintMember(rose);
		toPrintMember(lisa);
		
		//  #3  ///////////////////////////////////////////
		System.out.println("#3--------------------\n");
		ArrayList<ArrayList> blackpink = new ArrayList();
		blackpink.add(jisoo);
		blackpink.add(jennie);
		blackpink.add(rose);
		blackpink.add(lisa);
		
		System.out.println("BlackPink Member Info:\n");
		for(ArrayList memb : blackpink) {
			toPrintMember(memb);
		}
		
		//  #2-1  ///////////////////////////////////////////
		ArrayList<BlackPink> blackpinkVO = new ArrayList();
		for(int i = 0; i < blackpink.size(); i++) {
			BlackPink vo = new BlackPink();
			vo.setName((String) blackpink.get(i).get(0));
			vo.setId((String) blackpink.get(i).get(1));
			vo.setMail((String) blackpink.get(i).get(2));
			blackpinkVO.set(i, vo);
		}
		
		for(int i = 0; i < blackpinkVO.size(); i++) {
			
		}
		
	}
	
	public void toPrintMember(ArrayList memb) {
		System.out.printf("name: %s\nid: %s\nmail: %s\n\n", memb.get(0), memb.get(1), memb.get(2));
	}
	public static void main(String[] args) {
		new Ex00();
	}

}
