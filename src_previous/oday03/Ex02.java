import java.util.*;
import javax.swing.*;   // JOptionPane 쓰기 위해서 필요
class Ex02{
    /*
     * 문제 2]
     * 두 자리 숫자 두 개를 입력받아서
     * 두 수의 최소공배수를 구해서 출력해주는 프로그램을 작성하세요.
     */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("두 자리 자연수 두 개를 차례로 입력하세요.\n첫 번째 수를 입력하세요\n");
    int num1 = sc.nextInt();
    System.out.print("\n두 번째 수를 입력하세요\n");
    int num2 = sc.nextInt();
    int lnum = num1;
    if(num2 > num1){
        lnum = num2;
    }
    while(true){
        if(lnum % num1 != 0 || lnum % num2 != 0){
            lnum += 1;
        }
        else{
            System.out.printf("\n입력한 두 수의 최소공배수는 %d 입니다.", lnum);
            break;
        }
        }
    }
    }
    //String sno = JOptionPane.showInputDialog("정수를 입력하세요");
    //JOptionPane.showMessageDialog(null, "입력된 숫자: " + Integer.parseInt(sno));