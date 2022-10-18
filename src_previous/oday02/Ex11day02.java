import java.util.*;

class Ex11day02 {
    /*
     * 문제 9]
     * 게시판에 게시글을 게시할 예정이다.
     * 한 페이지에 15개의 게시글을 게시할 수 있다.
     * 게시글의 갯수를 랜덤하게 발생시켜서
     * 필요한 게시판 페이지가 몇 페이지인지를 출력해주는 프로그램을 작성하세요
     */
    public static void main(String[] args) {
        int max = 1000;
        int rnum = (int) (Math.random() * (max + 1));
        int ans;
        if (rnum == 0) {
            ans = 1;
        } else {
            ans = (int) Math.ceil(rnum / 15.0);
        }
        System.out.print("생성된 랜덤 숫자: ");
        System.out.println(rnum);
        System.out.print("필요한 게시판 페이지 수는 ");
        System.out.println(ans);
    }
}