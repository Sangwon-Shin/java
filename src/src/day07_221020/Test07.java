package day07_221020;

public class Test07 {

	public static void main(String[] args) {
		MyInfo jennie = new MyInfo();
		jennie.name = "jennie";
		jennie.height = 165.5;
		jennie.gen = 'F';
		
		System.out.println("name : " + jennie.name);
		System.out.println("height : " + jennie.height);
		System.out.println("gen : " + jennie.gen);
		
		MyInfo euns = new MyInfo();
		euns.name = "전은석";
		System.out.println("name : " + euns.name);
		System.out.println();
		
		
		MyInfo[] member = new MyInfo[4];
		for(int i = 0 ; i < 4 ; i++ ) {
			member[i] = new MyInfo();
		}
		member[0].name = "jennie";
		member[1].name = "lisa";
		member[2].name = "rose";
		member[3].name = "jisoo";
		
		for(MyInfo m : member) {
			System.out.println(m.name);
		}
	}

}
