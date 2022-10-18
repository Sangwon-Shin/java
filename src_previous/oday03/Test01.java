class Test01 {
    private int no1, no2, no3;

    public Test01() {
    }

    public Test01(int no1, int no2, int no3) {
        // 여기서 위에서 정의한 private data member no1을 쓰고 싶다면? no1 = no1으로 쓸 수 없다.
        this.no1 = no1;
        this.no2 = no2;
        this.no3 = no3;
    }

    public static void main(String[] args) {
        // Test01 t1 = new Test01();
        Test01 t2 = new Test01(1, 2, 3);
        Test01 t3 = new Test01(10, 20, 30);
        // Test01 t4 = new Test01();
        // Test01 t5 = new Test01();
        System.out.println("t2.no2 : " + t2.no2);
        System.out.println("t3.no2 : " + t3.no2);
    }
}