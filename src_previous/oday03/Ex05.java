/*
 * 문제 5]
 * 두 사람이 등산을 하는데
 * 한 사람은 이제 등산을 시작하려고 하고
 * 다른 사람은 정상에서 하산을 시작하려고 한다.
 * 올라가는 사람의 속도는 0.54 m/s 이고
 * 내려가는 사람의 속도는 1.07 m/s 이다.
 * 두 사람이 만나는 시점은 몇 분 몇 초 뒤인지 출력하는 프로그램을 작성하세요.
 * 등산로의 길이는 7564 m 이다.
 */
import javax.swing.*;
class Ex05 {
    public static void main(String[] args) {
        double vup = 0.54;
        double vdw = 1.07;
        double dist = 7564;
        double ans = dist / (vup + vdw);
        int hour = (int)(ans / 3600);
        int min = (int)(ans % 3600 / 60);
        int sec = (int)(Math.ceil(ans - hour * 3600 - min * 60));
        System.out.printf("두 사람은 %d시간 %d분 %d초 뒤에 만난다.", hour, min, sec);
        
        JOptionPane.showMessageDialog(null, "두 사람은\n" + hour + " 시간 " + min + " 분 " + sec + " 초 \n후에 만난다.");
    }
}