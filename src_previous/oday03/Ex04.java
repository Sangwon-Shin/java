/*
 * 문제 4]
 * 3~100 사이의 숫자 하나를 랜덤하게 발생시켜서
 * 이 숫자가 소수인지 판별해주는 프로그램을 작성하세요.
 */
class Ex04{
public static void main(String[] args) {
    int rnum = (int)(Math.random() * 98 + 3);
    String msg = "생성된 숫자 ";
    msg += rnum + "";
    if ( rnum % 2 == 0){
        msg += " (은)는 소수가 아닙니다.";
    }
    else{
        for (int div = 3; div < rnum; div += 2){
            if(rnum % div == 0){
                msg += " (은)는 소수가 아닙니다.";
                break;
            }
            else if(div == rnum - 2){
                msg += " (은)는 소수입니다.";
            }
        }
    }
    System.out.printf(msg);
}
}