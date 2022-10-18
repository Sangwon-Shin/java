class Ex07{
public static void main(String[] args) {
    // prob 7-1
    for(int i = 0; i < 5; i++){
        for(int j = 0; j <= i; j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    // prob 7-2
    for(int i = 0; i < 5; i++){
        for(int k = 0; k < 4-i; k++){
            System.out.print(" ");
        }
        for(int j = 0; j <= i; j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    // prob 7-3
    for(int i = 1; i <= 9; i+=2){
        for(int k = 0; k < (9-i)/2; k++){
            System.out.print(" ");
        }
        for(int j = 0; j < i; j++){
            System.out.print("*");
        }
        }
        System.out.print("\n");
    }
}
}