/*
    문제 6]
 *  1년은 365.2426일이다.
    이것은 며칠 몇 시간 몇 분 몇 초인지를 계산해서 출력하세요.
 */
class Ex06{
public static void main(String[] args) {
    String yrday = "365.2426";
    double yday = Double.parseDouble(yrday);
    int dsec = 86400;   // 1일을 초로 변환.
    int hsec = 3600;    // 1시간을 초로 변환.
    int msec = 60;
    double ysec = yday * dsec;
    int days = (int)(ysec / dsec);
    double rem = ysec - days * dsec;     // remainder
    int hrs = (int)(rem / hsec);
    rem = rem - hrs * hsec;
    int min = (int)(rem / msec);
    double sec = rem - min * msec;
    System.out.printf("%s일은 %d일 %d시간 %d분 %2.2f초이다.\n", yrday, days, hrs, min, sec);
}
}