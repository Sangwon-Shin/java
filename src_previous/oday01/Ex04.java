class Ex04{
    // 1-2+3-4+... 했을 경우 어디까지 했을때 그 결과가 100을 넘게 되는지?
public static void main(String[] args) {
    int sign = -1;
    int num = 0;
    int i = 0;
    while(num <= 100){
        sign *= -1;
        num += sign * ++i;
    }
    System.out.print(sign*i);

}
}