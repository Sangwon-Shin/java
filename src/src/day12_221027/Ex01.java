/*		
 2차원 배열
 
 1.

1	2	3	4	5
3	4	5	6	7
5	6	7	8	9
7	8	9	10	11
9	10	11	12	13

2.

1	3	5	7	9
4	6	8	10	12
7	9	11	13	15
10	12	14	16	18
13	15	17	19	21
 
 */

package day12_221027;

public class Ex01 {

	public Ex01() {
		// #1
		int ilen = 5;
		int jlen = 5;
		int[][] arr1 = new int[ilen][jlen];
		System.out.print("arr1: \n");
		for (int i = 0; i < ilen; i++) {
			for (int j = 0; j < jlen; j++) {
				arr1[i][j] = 2 * i + j + 1;
				System.out.print(arr1[i][j] + "\t");
				if (j == jlen - 1) {
					System.out.println();
				}
			}
		}
		
		// #2
		int[][] arr2 = new int[ilen][jlen];
		System.out.print("\n\narr2: \n");
		for (int i = 0; i < ilen; i++) {
			for (int j = 0; j < jlen; j++) {
				arr2[i][j] = 3 * i + 2 * j + 1;
				System.out.print(arr2[i][j] + "\t");
				if (j == jlen - 1) {
					System.out.println();
				}
			}
		}

	}

	public static void main(String[] args) {
		new Ex01();
	}

}
