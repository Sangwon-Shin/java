package day09_221024;

public class Test02 {
	public Test02() {
		Nemo[] sagak = new Nemo[3];
		// new Nemo[3] : heap에 Nemo 타입 데이터를 기억할 메모리 공간 3개를 만들어주세요
		Nemo nemo = new Nemo();
		nemo.width = 10;
		
		sagak[0] = nemo;
		sagak[1] = nemo;
		sagak[2] = nemo;

		nemo.width = 100;
		System.out.println(sagak[0].width);
		System.out.println(sagak[1].width);
		System.out.println(sagak[2].width);
		
		System.out.println(nemo.toString());
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
