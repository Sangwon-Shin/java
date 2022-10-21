/* 원, 삼각형, 사각형을 기억할 Object 타입 배열을 만들어서
 * 10개를 랜덤하게 채워넣고
 * 넓이 기준 오름차순으로 출력해주는 프로그램을 작성하세요.
 */
package day08_221021;

public class Ex02 {

	public static void main(String[] args) {
		Object[] obj = new Object[10];
		for (int i = 0; i < obj.length; i++) {
			int rnum = (int) (Math.random() * 3);
			switch (rnum) {
			case 0:
				obj[i] = new Won();
				((Won) obj[i]).rad = (int) (Math.random() * 16 + 5);
				((Won) obj[i]).setArea();
				((Won) obj[i]).setCirc();
				System.out.printf("i: %d,\tarea:%f\n", i, ((Won) obj[i]).area);
				break;
			case 1:
				obj[i] = new Semo();
				((Semo) obj[i]).width = (int) (Math.random() * 16 + 5);
				((Semo) obj[i]).height = (int) (Math.random() * 16 + 5);
				((Semo) obj[i]).setArea();
				System.out.printf("i: %d,\tarea:%f\n", i, ((Semo) obj[i]).area);
				break;
			case 2:
				obj[i] = new Rectangle();
				((Rectangle) obj[i]).width = (int) (Math.random() * 16 + 5);
				((Rectangle) obj[i]).height = (int) (Math.random() * 16 + 5);
				((Rectangle) obj[i]).setArea();
				((Rectangle) obj[i]).setAround();
				System.out.printf("i: %d,\tarea:%d\n", i, ((Rectangle) obj[i]).area);
				break;
			}
		}
		Integer[] idx = new Integer[obj.length];
		for (int i = 0; i < obj.length; i++) {
			idx[i] = i;
		}
		double area1, area2;
		for (int j = 0; j < obj.length - 1; j++) {
			if (obj[idx[j]] instanceof Won) {
				area1 = ((Won) obj[idx[j]]).area;
			} else if (obj[idx[j]] instanceof Semo) {
				area1 = ((Semo) obj[idx[j]]).area;
			} else {
				area1 = (double) ((Rectangle) obj[idx[j]]).area;
			}
			if (obj[idx[j] + 1] instanceof Won) {
				area2 = ((Won) obj[idx[j] + 1]).area;
			} else if (obj[idx[j] + 1] instanceof Semo) {
				area2 = ((Semo) obj[idx[j] + 1]).area;
			} else {
				area2 = (double) ((Rectangle) obj[idx[j] + 1]).area;
			}
			// System.out.printf("%f, %f\n", area1, area2);
			if (area1 > area2) {
				int tmp;
				tmp = idx[j] + 1;
				idx[j] = idx[j];
				idx[j] = tmp;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(idx[i]);
		}

		for (int i = 0; i < obj.length; i++) {
			if (obj[idx[i]] instanceof Won) {
				System.out.printf("obj[%d]의 클래스는 Won 이고,\n 반지름은 %d, 둘레는 %f, 넓이는 %f 이다.\n\n", idx[i],
						((Won) obj[idx[i]]).rad, ((Won) obj[idx[i]]).circ, ((Won) obj[idx[i]]).area);
			} else if (obj[idx[i]] instanceof Semo) {
				System.out.printf("obj[%d]의 클래스는 Semo 이고,\n 밑변은 %d, 높이는 %d, 넓이는 %f 이다.\n\n", idx[i],
						((Semo) obj[idx[i]]).width, ((Semo) obj[idx[i]]).height, ((Semo) obj[idx[i]]).area);
			} else {
				System.out.printf("obj[%d]의 클래스는 Rectangle 이고,\n 밑변은 %d, 높이는 %d, 둘레는 %d, 넓이는 %d 이다.\n\n", idx[i],
						((Rectangle) obj[idx[i]]).width, ((Rectangle) obj[idx[i]]).height,
						((Rectangle) obj[idx[i]]).around, ((Rectangle) obj[idx[i]]).area);
			}
		}
	}
}
