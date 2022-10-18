class Ex05{
    /*
	문제 5 ]
		21 부터 99 사이의 랜덤한 숫자 10개를 만들어서
		그 숫자들을 더한 합을 출력해주는 프로그램을 작성하세요.
 */
public static void main(String[] args) {
    int iter = 10;
    int sum = 0;
    for(int i = 0; i < iter; i++){
        int rnum = (int)(Math.random() * 79) + 21;
        System.out.println(rnum);
        sum += rnum;
    }
    System.out.print("sum is ");
    System.out.println(sum);
}
}