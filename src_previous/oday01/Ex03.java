class Ex03{
public static void main(String[] args) {
    // 30~50 사이의 정수를 랜덤하게 발생시켜서 2와 그 수 사이에 있는 소수를 출력하세요.
    int rnum = (int)(Math.random()*21) + 30;
    System.out.println("generated number is " + rnum);
    String msg;
    for(int i = 2; i < rnum; i++){
        msg = i + " is a prime number\n";
        for(int j = 3; j < i; j++){
            if(i % j == 0){
                msg = "";
                break;
            }
            else{
                continue;
            }
        }
        System.out.print(msg);
        }
    }
}
