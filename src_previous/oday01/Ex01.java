class Ex01{
    // 구구단의 단을 랜덤하게 발생시켜서 출력하는 프로그램을 작성하시오
public static void main(String[] args) {
    int rnum = (int)(Math.random()*9)+1;
    for(int i = 1; i<10; i++){
        int prod = rnum * i;
        String line = rnum + " x " + i + " = " + prod;
        System.out.println(line);
    }
}
}