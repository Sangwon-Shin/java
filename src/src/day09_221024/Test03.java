package day09_221024;

public class Test03 {
	public Test03() {
		//int[] no1 = new float[3];	// 에러
		//float[] no2 = new int[3];	// 에러
		int[] no3 = new int[10];
		for(int no : no3) {
			System.out.print(no + ", ");	// 자동초기화 확인
		}
		System.out.println();
		
		Nemo[] nemo = new Nemo[5];
		for(Nemo n : nemo) {
			System.out.print(n.width);	// error. n's are null. 
		}
	}
	public static void main(String[] args) {
		new Test03();
		
	}

}
