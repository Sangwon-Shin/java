import java.util.*;
class Ex04{
/*
    문제 2 ]
        세 자리 자연수를 입력받은 후 십단위 이하를 버린 숫자를 만들어서 출력하세요.
*/    
public static void main(String[] args) {
    System.out.println("세 자리 자연수를 입력하세요");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print("입력한 수는 ");
    System.out.print(num);
    System.out.println("입니다.");
    sc.close();
    num = num / 100 * 100;
    System.out.print("십의 자리 이하를 버린 수는 ");
    System.out.println(num);
    System.out.println("입니다.");
}
}