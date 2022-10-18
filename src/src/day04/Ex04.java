package day04;

public class Ex04 {

	public static void main(String[] args) {
/* 문제 4]
 * 1년은 365.2426일이다. 이 시간은 며칠 몇시간 몇분 몇초로 이루어져있는지 계산해서 출력하세요
 */		
		String msg = "";
		double yrd = 365.2426;
		msg += "1년은 " + yrd +"일이고 이것은"; 
		int day = 3600*24;
		int hr = 3600;
		int min = 60;
		int[] time = {day, hr, min};
		String[] timec = {"일", "시간", "분"};
		int[] time_conv = {0, 0, 0};
		double yr = yrd * day;
		for(int j = 0; j < time.length; j++) {
			time_conv[j] = (int) Math.floor(yr / time[j]);
			yr = yr - time_conv[j] * time[j];
			msg += " " + time_conv[j] + timec[j];
		}
		msg += " " + yr + "초이다.";
		System.out.print(msg);
		
		
	}

}
