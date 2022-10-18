/* 문제 1]
 * 5자리 숫자를 랜덤하게 발생시켜서
 * 각 자리수의 합을 구해주는 프로그램을 작성하세요.
 */
class Ex01{
public static void main(String[] args) {
    int rnum = (int)(Math.random() * 90000 + 10000);
    System.out.printf("랜덤하게 발생시킨 수는 %d 입니다.", rnum);
    int sum = 0;
    while(rnum > 0){
        sum += rnum % 10;
        rnum /= 10;
    }
    System.out.printf("\n이 수의 각 자리수의 합은 %d 입니다.", sum);
}
}