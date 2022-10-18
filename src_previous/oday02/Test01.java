class Test01{
public static void main(String[] args) {
    // 숫자 형태의 문자 4개를 만들어서 순서대로 나열하고
    // 그 숫자를 24로 나눈 몫과 나머지를 계산하세요.
    // 단, 처음 뽑은 숫자가 0이면 0이 아닌 숫자를 뽑을 때까지 다시 뽑는다.
    int iter = 4;
    String sno = "";
    for(int i = 0; i < iter; i++){
        char ch  = (char)(Math.random() * ('9' - '0' + 1) + '0');
        if(i == 0 && ch == '0') {
            --i;
            continue;
        }
        sno += ch;
    }
    int num = Integer.parseInt(sno);
    int quo = num / 24;
    int rem = num % 24;
    System.out.printf("만든 숫자: %d\n24로 나눈 몫: %d\n24로 나눈 나머지: %d\n", num, quo, rem);


}
}