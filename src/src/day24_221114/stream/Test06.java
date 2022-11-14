package day24_221114.stream;
import java.io.*;
public class Test06 {
/*
 	현재 폴더에서 확장자가 txt 인 파일들만 리스트를 추출해보자.
 */
	public Test06() {
		// 목록을 보고 싶은 파일 객체를 만들고
		File file = new File("src/day24_221114/stream");
		
		// 파일 리스트 출력
		/*
		String[] list = file.list();
		for(String dir : list) {
			System.out.println(dir);
		}
		*/
		
		// 파일 이름, 크기 출력
		/*
		File[] list = file.listFiles();
		
		for(File f : list) {
			String fileName = f.getName();
			long len = f.length();
			System.out.println(fileName + " - " + len + " byte");
		}
		*/
		
		// 확장자가 txt 인 파일들 추출
		String[] list = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				/*
			 		매개변수
			 			File dir 	: 현재 파일의 정보를 알려주고
			 			String name : 현재 파일의 이름만 알려준다.
			 		목록을 구하는 파일을 하나씩	발견할 때마다
			 		이 함수가 자동호출된다.
			 		이 함수에서 true 를 반환하면, 목록에 포함시키고
			 		이 함수에서 false 를 반환하면, 목록에 포함시키지 않는다.  
				 */
				/* 직접 확장자를 꺼내는 방법
				String ext = name.substring(name.lastIndexOf("."));
				return ext.equals(".txt");
				*/
				
				return name.endsWith(".txt"); // !!!!!!!!!!
			}
		});
		
		for(String fname : list) {
			System.out.println(fname);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
