package day10_221025;

import day08_221021.*; // day08_221021 안의 모든 클래스 import

public class Test01 {
	// 생성자 중 매개변수가 없는 형태의 생성자를 기본생성자라 한다.
	// 생성자를 하나도 만들지 않으면 JVM이 기본생성자를 자동으로 만든다.
	public Test01() {
		/*
		 * 랜덤하게 원, 세모, 네모를 만들어서 내용을 출력해보자. 단, 랜덤하게 만들어진 도형의 변수는 모든 도형을 입력할 수 있는
		 * 타입(Object)으로 한다.
		 * 
		 * Object obj1 = new Won(); Object obj2 = new Semo(); Object obj3 = new Nemo();
		 * 
		 * 이렇게 작성한 클래스를 Object 타입 변수에 담으면 클래스에 정의해 둔 함수와 변수는 사용할 수 없다. 왜냐면 Object 클래스에는
		 * 그 함수와 변수가 없기 때문이다. 따라서 원래 작성한 함수와 변수를 사용하려면 작성한 클래스 타입으로 강제 형변환 해줘야 한다. 패키지가
		 * 다른 클래스에서 접근할 수 있게 하려면 멤버들에도 public 붙여야함
		 */
		int arrLen = 10;
		Object[] arr = new Object[arrLen];
		for (int i = 0; i < arrLen; i++) {
			int rnum = (int) (Math.random() * 3);
			switch (rnum) {
			case 0:
				Won won = new Won();
				won.rad = (int) (Math.random() * 16 + 5);
				won.setAround();
				won.setArea();
				/*
				 * Object 클래스에서 상속받은 메소드들도 쓸 수 있다. won.toString(); won.equals("Won");
				 */
				arr[i] = won;
				break;
			case 1:
				Semo semo = new Semo();
				semo.width = (int) (Math.random() * 16 + 5);
				semo.height = (int) (Math.random() * 16 + 5);
				semo.setArea();
				arr[i] = semo;
				break;
			case 2:
				Nemo nemo = new Nemo();
				nemo.width = (int) (Math.random() * 16 + 5);
				nemo.height = (int) (Math.random() * 16 + 5);
				nemo.setArea();
				arr[i] = nemo;
				break;
			}
		}
		double area1 = 0;
		double area2 = 0;
		for (int i = 0; i < arrLen - 1; i++) {
			if (arr[i] instanceof Won) {
				area1 = ((Won) arr[i]).area;
			} else if (arr[i] instanceof Semo) {
				area1 = ((Semo) arr[i]).area;
			} else if (arr[i] instanceof Nemo) {
				area1 = ((Nemo) arr[i]).area;
			}
			for (int j = i + 1; j < arrLen; j++) {
				if (arr[j] instanceof Won) {
					area2 = ((Won) arr[j]).area;
				} else if (arr[j] instanceof Semo) {
					area2 = ((Semo) arr[j]).area;
				} else if (arr[j] instanceof Nemo) {
					area2 = ((Nemo) arr[j]).area;
				}
				if (area1 > area2) {
					Object tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					area1 = area2;	// *****
				}
			}
		}
		for (int i = 0; i < arrLen; i++) {
			if (arr[i] instanceof Won) {
				System.out.println("원의 면적: " + ((Won) arr[i]).area);
			} else if (arr[i] instanceof Semo) {
				System.out.println("삼각형의 면적: " + ((Semo) arr[i]).area);
			} else if (arr[i] instanceof Nemo) {
				System.out.println("사각형의 면적: " + ((Nemo) arr[i]).area);
			}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
