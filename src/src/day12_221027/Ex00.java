/*
 *  1. 반복문을 이용해서 아래와 같은 2차원 배열 arr을 만들고
 *  출력하세요
 * 		1	2	3	4	5
 * 		6	7	8	9	10
 * 		11	12	13	14	15
 * 		16	17	18	19	20
 * 		21	22	23	24	25
 * 
 *  2. 2차원 배열 nums 만들고 출력
 *  	1	6	11	16	21
 *  	2	7	12	17	22
 *  	3	8	13	18	23
 *  	4	9	14	19	24
 *  	5	10	15	20	25
 *  
 *  3. 2 이상의 정수 중에서 소수를 10개 찾아서 배열에 담고 출력
 */		
 		
 		


package day12_221027;

public class Ex00 {
	
	public Ex00() {
		int ilen = 5;
		int jlen = 5;
		int[][] arr = new int[ilen][jlen];
		int fill = 1;
		System.out.print("arr: \n");
		for(int i = 0; i < ilen; i++) {
			for(int j = 0; j < jlen; j++) {
				arr[i][j] = fill++;
				System.out.print(arr[i][j] + "\t");
				if(j == jlen-1) {
					System.out.println();
				}
			}			
		}
		
		int[][] nums = new int[ilen][jlen];
		fill = 1;
		for(int i = 0; i < ilen; i++) {
			for(int j = 0; j < jlen; j++) {
				arr[j][i] = fill++;
			}
		}
		System.out.print("\n\nnums: \n");
		for(int i = 0; i < ilen; i++) {
			for(int j = 0; j < jlen; j++) {
				System.out.print(arr[i][j] + "\t");
				if(j == jlen-1) {
					System.out.println();
				}
			}
		}
		
		
		int[] pnum = new int[10];
		pnum[0] = 2;
		int p = 3;
		int nop = 1;
		ee:
		while(nop < 10) {
			for(int i = 2; i <= p/2; i++) {
				if(p % i == 0) {
					p++;
					continue ee;
				}
			}
			pnum[nop++] = p++;
		}
		System.out.print("\nArray of Prime Numbers of Length 10: \n");
		for(int i = 0; i < pnum.length; i++) {
			System.out.print(pnum[i] + ", ");
		}
	}

	public static void main(String[] args) {
		new Ex00();
	}

}
