import java.util.*;

class Ex10{
    // 1. 키보드로 문자열을 입력받아서
    // 2. 출력하고
    // 3. 하나씩 꺼내서 출력하세요.

    // 문자열 중에서 특정위치의 문자 추출하는 방법
    // char ch = 문자열.charAt(위치값);
    // 참고] 문자열 중 특정 문자의 위치값을 반환해주는 함수
    //  문자열.indexOf(문자 || 문자열);
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    System.out.println(str);
    for(int i = 0; i < str.length(); i++){
        System.out.println(str.charAt(i));
    }
}
}