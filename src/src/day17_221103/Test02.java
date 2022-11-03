package day17_221103;
import java.util.*;
public class Test02 {

	public Test02() {
		//Calendar cal = new Calendar	Error. Calendar is an abstract class
		Calendar cal = Calendar.getInstance();
		String stime = cal.getTime().toString();
		System.out.println(stime);
		int year = cal.YEAR;
		System.out.println(year);	// prints 1 ???????
	}

	public static void main(String[] args) {
		new Test02();
	}

}
