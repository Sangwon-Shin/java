import java.lang;
import java.util.*;
class Test03{
    /*
     *  키보드로 입력 받는 방법
     *  Scanner sc = new Scanner(System.in); // 입력도구...
     *  String str = sc.nextLine(); // 문자열로 꺼내기...
     *  int no = sc.nextInt(); // 정수 형태로 입력한 경우
     */
public static void main(String[] args) {
    // 숫자를 입력받아서 입력된 숫자가 짝수인지 홀수인지를 판별하세요.
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close(); // 사용을 마친 자원은 반환하는 것이 원칙.
    String msg = " is odd";
    if(num % 2 == 0){
        msg = " is even";
    }
    msg = num + msg;
    System.out.print(msg);

}
}