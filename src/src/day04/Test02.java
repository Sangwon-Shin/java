package day04;
import java.util.Scanner;
public class Test02 {
	/*콘솔로 입력받는 방법
	1.
			import java.util.Scanner;
		로 사용할 클래스(Scanner)가 있는 위치를 알려주거나
			import java.util.*;
		그 클래스가 속한 클래스(util) 내의 모든 클래스들을 포함시키면 된다.
	2.
		함수 내에서
			Scanner sc = new Scanner(System.in);
		명령으로 객체를 만든다.
	3.
		입력메시지를 출력해주고
		System.out.print("메시지");
	4.
		사용목적에 따라서 함수를 호출해서 입력데이터를 꺼내면 된다.
		문자열]		String str = sc.nextLine();
		정수]		int no = sc.nextInt();
		실수]		double no2 = sc.nextDouble();
		등으로 읽어서 변수에 기억시켜서 사용하면 된다.
*/
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력메시지 출력
		System.out.print("이름입력: ");
		// 읽어서 변수에 기억시키기
		String name = sc.nextLine();
		// 나이 입력 메시지 출력
		System.out.print("나이입력: ");
		// 읽어서 변수에 기억시키기
		int age = sc.nextInt();
		// 출력
		System.out.printf("이름: %4s, 나이: %3d", name, age);
	
	}

}
