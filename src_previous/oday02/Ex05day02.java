class Ex05day2 {
    /*
     * 문제 3 ]
     * 0 ~ 255 사이의 랜덤한 아스키 코드를 만들어서
     * 이 코드값에 해당하는 문자가 알파벳인지 아닌지 판별해주는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        String msg = "";
        char rchr = (char) (Math.random() * 256);
        msg += "랜덤하게 생성된 문자는 ";
        msg += rchr;
        msg += "입니다.\n";
        if ((rchr >= 'A' && rchr <= 'Z') || (rchr >= 'a' && rchr <= 'z')) {
            msg += rchr;
            msg += "는 알파벳 문자입니다.";
        } else {
            msg += rchr;
            msg += "는 알파벳 문자가 아닙니다.";
        }
        System.out.print(msg);
    }

}
