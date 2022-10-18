class Ex02{
    // 'A'부터 문자를 10개를 만들어서 출력하세요
    public static void main(String[] args) {
       
        char chr = 'A';
        for(int i = 0; i<10; i++){
            System.out.println(chr);
            chr += 1;
        }

    }
}