import java.util.*;

class Ex07day02 {
    /*
     * 문제 5 ]
     * 소수점이 있는 숫자를 입력받은 후
     * 소수점 이하 세번째 자리에서 반올림한 결과를 계산해서 출력하세요.
     */
    public static void main(String[] args) {
        System.out.println("소수점 이하가 0이 아닌 수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        String msg = "";
        msg += "입력한 수는 ";
        msg += num;
        msg += "입니다.\n이 수를 소수점 이하 세번째 자리에서 반올림한 수는 ";
        int tmp = (int) (num * 1000);
        int d = tmp % 10;
        if (d > 4) {
            tmp += 10;
        }
        tmp -= d;
        float res = (float) tmp / 1000;
        msg += res;
        msg += "입니다.";
        System.out.println(msg);
    }
}