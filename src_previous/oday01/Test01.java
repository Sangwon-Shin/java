class Helloworld{
public static void main(String[] args) {
    String x = "Hello Java!";
    System.out.println(x);
    
    // 두 정수 사이의 랜덤한 정수를 발생시키는 방법
    //(int)(Math.random()*(b-a)+1);

    for(int i = 0; i<5;i++){
        int no = (int)(Math.random()*(10-1)+1);
        System.out.println(no);
    }

    }
}