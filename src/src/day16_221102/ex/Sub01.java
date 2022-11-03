package day16_221102.ex;

public class Sub01 {
	public Sub01() {}
	public Sub01(Extra extra) {
		int ndoh = 10;	// number of dohyungs in Dohyung[] arr
		Dohyung[] dArr = new Dohyung[ndoh];
		
		for(int i = 0; i < ndoh; i++) {
			int rnum = (int)(Math.random() * 3);
			switch(rnum) {
			case 0:
				int rad = (int)(Math.random() * 16 + 5) / 2;
				dArr[i] = new Dongle(rad);
				break;
			case 1:
				int width = (int)(Math.random() * 16 + 5);
				int height = (int)(Math.random() * 16 + 5);
				dArr[i] = new Semo(width, height);
				break;
			case 2:
				int width2 = (int)(Math.random() * 16 + 5);
				int height2 = (int)(Math.random() * 16 + 5);
				dArr[i] = new Nemo(width2, height2);
				break;
			}
		}
		
		extra.setArr(dArr);
		
		for(int i = 0; i < ndoh; i++) {
			extra.getArr()[i].toPrint();
		}
	}
}
