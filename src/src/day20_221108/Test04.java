/*
 	랜덤하게 학생 성적을 10 개 발생시켜서 기억시키고
 	60 점 이상과 60점 미만을 별도로 기억시켜보자. 
 */
package day20_221108;
import java.util.*;
public class Test04 {
	
	public Test04() {
		TreeSet set = new TreeSet();
		while(set.size() < 10) {
			set.add((int)(Math.random() * 101));
		}
		
		// 출력
		Iterator<Integer> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
		TreeSet lowSet = (TreeSet) set.headSet(60);
		
		itor = lowSet.iterator();
		System.out.println("#### 60점 미만 ####");
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
		System.out.println("#### 60점 이상 ####");
		TreeSet upSet = (TreeSet) set.tailSet(60);
		itor = upSet.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test04();
	}

}
