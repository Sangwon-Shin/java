import java.util.*;
class Ex13day02{
    /*
 *  문제 11]
 *  다섯 자리의 숫자를 입력받아서
 *  그 숫자가 회문수인지 아닌지를 판별하는 프로그램을 작성하세요.
 */
public static void main(String[] args) {
    System.out.println("자연수를 입력하세요");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    /*
    int div = (int) Math.pow(10,(num + "").length()-1);
    int a;
    int d;
    String msg = "입력한 수는 회문수입니다.";
    while (num > 10) {
        d = num % 10;
        a = num / div;
        if (a != d){
            msg = "입력한 수는 회문수가 아닙니다.";
            break;
        }
        num = (num % div) / 10;
        div /= 100;
    }
     */
    String snum = sc.next();
    String msg = "입력한 수는 회문수입니다.";
    for (int i = 0; i < snum.length()/2; i++){
        if(snum.charAt(i) != snum.charAt(snum.length()-i-1)){
            msg = "입력한 수는 회문수가 아닙니다.";
        }
    }
    System.out.println(msg);
}
}