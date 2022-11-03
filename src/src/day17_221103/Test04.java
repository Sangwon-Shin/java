package day17_221103;

public class Test04 {
	private Figure[] fig;
	public Test04() {
		setFig();
		printFig();
		Figure f = new Sagak(10, 20);	// Figure -(상속)-> Nemo -(상속)-> Sagak
		f.toPrint();
	}

	public void setFig() {
		int len = (int)(Math.random() * 16 + 5);
		fig = new Figure[len];
		for(int i = 0; i < len; i++) {
			int fType = (int)(Math.random() * 3);
			switch(fType) {
			case 0:
				int rad = (int)(Math.random() * 16 + 5);
				fig[i] = new Dongle(rad);
				break;
			case 1:
				int width = (int)(Math.random() * 16 + 5);
				int height = (int)(Math.random() * 16 + 5);
				fig[i] = new Semo(width, height);
				break;
			case 2:
				int garo = (int)(Math.random() * 16 + 5);
				int sero = (int)(Math.random() * 16 + 5);
				fig[i] = new Nemo(garo, sero);
				break;
			}
		}
		
	}
	
	public void printFig() {
		for(int i = 0; i < fig.length; i++) {
			fig[i].toPrint();
		}
	}
	public static void main(String[] args) {
		new Test04();
	}

}
