/*
 *  79456원을 샌드위치값으로 지불하려고 한다.
 *  이 금액은 우리나라 화폐가 각각 몇 개로 지불해야 하는가?(가능한 한 단위가 큰 화폐를 써야 한다.)
 *  (1원짜리 화폐도 있다고 가정.)
 */
class Ex01 {
    public static void main(String[] args) {
        int total = 79456;
        int arr[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
        //int numb[] = new int[arr.length];
        int num;
        String msg = total + "원을 지불하기 위해서는\n";
        for (int i = 0; i < arr.length; i++) {
            num = total / arr[i];
            total -= num * arr[i];
            if (num != 0) {
                msg += arr[i] + "원권 " + num + "개\n";
            }
        }
        msg += "가 필요합니다.";
        System.out.print(msg);
    }
}
