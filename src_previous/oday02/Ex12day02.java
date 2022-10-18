import java.util.*;
class Ex12day02{
    /*
 *  문제 10]
 *  전기 요금을 계산해주는 프로그램을 작성하세요.
 *          코드        기본요금        사용요금(kW당)
 *  가정용  1           3800            245
 *  산업용  2           2400            157
 *  교육용  3           2900            169
 *  상업용  4           3200            174
 * 
 * 계산식은, 기본요금 + 사용량 * 사용요금
 * 
 * 코드를 입력하고, 사용량을 입력하면
 * 전기요금을 계산해주는 프로그램을 작성하세요.
 */
public static void main(String[] args) {
    int[][] fee = new int[4][3];
    int[] feeBasic = {3800, 2400, 2900, 3200};
    int[] feeKw = {245, 157, 169, 174};
    for(int i = 0; i < 4; i++){
        fee[i][0] = i;
        fee[i][1] = feeBasic[i];
        fee[i][2] = feeKw[i];
    }
    
    System.out.print("전기 용도 분류 코드를 입력하세요.\n가정용: 1\n산업용: 2\n교육용: 3\n상업용: 4\n");
    Scanner sc = new Scanner(System.in);
    int code = sc.nextInt();
    System.out.println("전기 사용량을 소수점 이하는 버리고 kW 단위로 입력하세요.");
    int kw = sc.nextInt();
    System.out.println("입력한 조건 하에서 전기 요금은 ");
    int totalFee = fee[code-1][1] + fee[code-1][2] * kw;
    System.out.print(totalFee);
    System.out.println("원\n입니다.");


 


}
}