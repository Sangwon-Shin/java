package day21_221109;

import java.util.*;

public class Test02 {
	Comparator localComp;
	public Test02() {
		TreeSet set1 = new TreeSet(new Comparator() {
			// 무명 내부클래스
			@Override
			public int compare(Object arg0, Object arg1) {
				return 0;
			}
		});
	}

	public static void main(String[] args) {
		new Test02();
	}

	class SetSort1 implements Comparator {
		// 전역 내부클래스
		@Override
		public int compare(Object o1, Object o2) {
			return 0;
		}

	}

	public TreeSet getTree() {
		TreeSet set;

		// ↓지역 내부클래스. 이 메소드 안에서만 사용할 수 있는 클래스
		// 외부에서도 사용하고 싶으면 Comparator 타입 전역변수를 만들고 기억시켜서...
		class LInnerCls implements Comparator {
			@Override
			public int compare(Object o1, Object o2) {
				return 0;
			}
		}
		localComp = new LInnerCls();
		//set = new TreeSet(new LInnerCls());
		set = new TreeSet(localComp);
		return set;

	}
}
