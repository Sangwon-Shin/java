class AddtionalProbs {
    public static void main(String[] args) {
        /*
        구리게 풀었네...
        System.out.printf("%3d", num++)를 쓰면 간단.
         * // 추가문제 1 ]
         * 
         *  1  2  3  4  5
         *  6  7  8  9 10
         * 11 12 13 14 15
         * 16 17 18 19 20
         * 21 22 23 24 25
         */
        int cil = 5; // number of Characters In a Line
        int tnum = 25; // total number to be displayed
        int lnum; // number of lines
        if (tnum % cil != 0) {
            lnum = tnum / cil + 1;
        } else {
            lnum = tnum / cil;
        }
        for (int i = 0; i < lnum; i++) {
            for (int j = 0; j < cil; j++) {
                int numb = i * cil + (j + 1);
                if (numb < 10) {
                    System.out.print(" ");
                }
                System.out.print(numb);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        /*
         * 추가문제 2 ]
         *  1
         *  2  3
         *  4  5  6
         *  7  8  9 10
         * 11 12 13 14 15
         */

        int tnum2 = 15; // total number to be displayed
        int num2 = 1;
        int cil2 = 0;   // number of characters in a line
        while(num2 < tnum2){
            cil2 += 1;
            for(int i = 0; i < cil2; i++){
                if (num2 < 10) {
                    System.out.print(" ");
                }
                System.out.print(num2);
                System.out.print(" ");
                num2 += 1;
            }
            System.out.print("\n");
        }
     
    }
}