import java.util.*;
class Ex09day02{
    /*
     *  문제 7 ]
     *  산수 계산식을 입력받으면
     *  그 결과를 처리해서 출력해주는 프로그램을 작성하세요.
     *  (가 원래 문제였으나 알고보니 두 숫자의 사칙연산 식만 처리해주는 프로그램이었음.)
     */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String eqn = sc.next();
    int div;
    for(int i = 0; i < eqn.length(); i++){
        if(eqn.charAt(i) == '/'){
            div = i;
            eqn = eqn.substring(0,div) + "(double)" + eqn.substring(div+1,eqn.length());

        }
    }
}
} 
