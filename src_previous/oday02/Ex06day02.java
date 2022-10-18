class Ex06 {
    /*
     * 화씨 온도 100도는 섭씨 온도로 얼마인지 출력하는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        double tf = 100;
        double tc = 5 / 9d * (tf - 32);
        String msg = "";
        msg += "화씨 ";
        msg += tf;
        msg += "도는 섭씨 ";
        msg += tc;
        msg += "도 입니다.";
        System.out.print(msg);
    }
}