class Classname{
    public static void main(String[] args) {
        // 10~99 사이의 랜덤한 숫자 다섯 개를 발생시켜서
        // 각 숫자가 홀수인지 짝수인지를 판별해서 출력하시오.
        int iter = 5;
        for(int i = 0; i<iter; i++){
            int rnum = (int)(Math.random()*90) + 10;
            System.out.print(rnum);
            if(rnum % 2 == 0){
                System.out.println(" is even");
            }
            else{
                System.out.println(" is odd");
            }
            }
        }
    }
    

    

/*
static void abc() {
        System.out.println("start");
    }
}
    static void getPerson() {
        Person p1 = new Person();
        p1.name = "jennie";
        p1.age = 27;

        Person na = new Person();
        na.name = "신상원";
        na.age = 22;
    }
    */
