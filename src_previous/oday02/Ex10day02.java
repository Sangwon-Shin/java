import java.util.*;

class Ex10day02 {

    /*
     * 문제 8 ]
     * 정수 3개를 입력받아서
     * 세 수중 제일 큰수만 출력해주는 프로그램을 작성하세요.
     * 
     * extra] 가장 작은 수, 중간 수도 출력하는 프로그램
     */
    public static void main(String[] args) {
        System.out.print("세 개의 정수를 하나씩 입력하세요.\n첫 번째 정수를 입력하세요.\n");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요.\n");
        int num2 = sc.nextInt();
        System.out.print("세 번째 정수를 입력하세요.\n");
        int num3 = sc.nextInt();
        sc.close();
        /*
        int bigg = num1;
        if (num2 > bigg) {
            bigg = num2;
        }
        if (num3 > bigg) {
            bigg = num3;
        }
        System.out.println("입력한 세 정수 중 가장 큰 수는 ");
        System.out.println(bigg);
        System.out.println("입니다.");
         */
        int big, mid, sml;
        if(num1 > num2){
            int tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        if(num2<num3){
            big = num3;
            mid = num2;
            sml = num1;
        }
        else if(num1 < num3){
            big = num2;
            mid = num3;
            sml = num1;
        }
        else{
            big = num2;
            mid = num1;
            sml = num3;
        }
        System.out.printf("세 수를 내림차순으로 정렬하면 %d, %d, %d 입니다.\n", big, mid, sml);
        }
}


