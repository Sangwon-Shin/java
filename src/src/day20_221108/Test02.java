/*
	Semo 객체 5 개를 만들어서
	TreeSet 에서 관리하세요 
 */
package day20_221108;
import java.util.*;
public class Test02 {
	String[] woojoo= {"보나", "은서", "다영", "루다", "설아", "여름",
			"엑시", "수빈", "다원", "연정"};
	TreeSet set;
	public Test02() {
		addWoojoo();
		setLotto();
		addSemo();
		addSamgak();
	}
	// 우주소녀 멤버로 채우기
	public void addWoojoo() {
		set = new TreeSet();
		for(int i = 0; i < woojoo.length; i++) {
			set.add(woojoo[i]);
		}
	}
	
	public void addSemo() {
		// Semo 는 비교불가능한 타입.
		set = new TreeSet(new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				Semo s1 = (Semo) o1;
				Semo s2 = (Semo) o2;
				// 면적 기준 내림차순 정렬
				int result = s1.getArea() == s2.getArea() ? 0 :
								s1.getArea() < s2.getArea() ? 1 : -1; 
				return result;
			}
		});
		
		int nSemo = 5;
		for(int i = 0; i < nSemo; i++) {
			Semo semo = new Semo((int)(Math.random() * 16 + 5)
					, (int)(Math.random() * 16 + 5));
			set.add(semo);
		}
		
		// 1. Iterator 이용 출력
		System.out.println("\nSemo 객체 Iterator 이용 출력");
		Iterator<Semo> itor = set.iterator();
		while(itor.hasNext()) {
			Semo s = itor.next();
			System.out.printf("가로: %3d | 세로: %3d | 넓이: %5.2f\n"
					, s.getWidth(), s.getHeight(), s.getArea());
		}
		
		// 2. ArrayList 이용 출력
		System.out.println("\nSemo 객체 ArrayList 이용 출력");
		ArrayList<Semo> list = new ArrayList<Semo>(set);
		for(int i = 0; i < list.size(); i++) {
			Semo s = list.get(i);
			System.out.printf("가로: %3d | 세로: %3d | 넓이: %5.2f\n"
					, s.getWidth(), s.getHeight(), s.getArea());
		}
	}
	
	// 삼각 클래스 객체 5개 추가
	public void addSamgak() {
		set = new TreeSet();
		while(set.size() < 5) {
			set.add(new Samgak((int)(Math.random() * 16 + 5), (int)(Math.random() * 16 + 5)));
		}
		ArrayList<Samgak> list = new ArrayList<Samgak>(set);
		System.out.println("\n Samgak 객체 5개");
		for(Samgak s : list) {
			System.out.printf("가로: %3d | 세로: %3d | 넓이: %5.2f\n"
					, s.getWidth(), s.getHeight(), s.getArea());
		}
	}
	// 로또
	public void setLotto() {
		// ↓ 크기비교가 되는 타입이면 comparator 를 설정하지 않아도 된다.
		int cnt = 1;
		while(set.size() < 6) {
			System.out.print(cnt++ + " | ");
			set.add((int)(Math.random() * 45 + 1));
		}
		System.out.println();
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
