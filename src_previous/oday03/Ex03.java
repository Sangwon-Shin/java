/* 문제 3]
 * 2x + 4y = 10 을 만족시키는 x, y 의 조합을 출력하세요.
 * 단, x, y는 1보다 크거나 같고 10보다 작거나 같은 정수이다.
*/
class Ex03{
public static void main(String[] args) {
    for(int x = 1; x <= 10; x++){
        for(int y = 1; y <= 10; y++){
            if(2*x + 4*y == 10){
                System.out.printf("x=%d, y=%d 일 때 2x + 4y = 10 이 성립합니다.\n", x, y);
            }
        }
    }
}
}