import java.util.*;
class Ex08day02{
    /*
     * 문제 6 ]
     * 숫자 하나를 입력받은 후 그 숫자보다 큰 가장 가까운 10의 배수와
     * (아래 코드는 그냥 가장 가까운 10의 배수)
     * 입력한 숫자와의 차이를 출력하는 프로그램을 작성하세요.
     */
public static void main(String[] args) {
    System.out.println("실수를 입력하세요");
    Scanner sc = new Scanner(System.in);
    String num = sc.next();
    //String num = "23546.24236346";
    // 참고: 두 문자열을 비교할 때는 str1.equals(str2)를 써야 한다. 그러면 true, false로 나옴.
    if (num.charAt(0) == '-'){
        num = num.substring(1,num.length());
    }
    int dot = -1;
    for(int i = 0; i < num.length(); i++){
        if (num.charAt(i) == '.'){          
            dot = i;
        }
    }
    int olen = num.length();
    if (dot > 0) {
        num = num.substring(dot-1,dot)+ num.substring(dot+1,olen);
    }
    int inum =  Integer.parseInt(num);
    String crit = "5";
    String tmp = "1";
    for (int i = 0; i < num.length()-1; i++){
        crit += "0";
        tmp += "0";
    }
    tmp += "0";
    int icrit = Integer.parseInt(crit);
    int itmp = Integer.parseInt(tmp);

    String ans = "";
    if (inum > icrit) {
        int ians = itmp - inum;
        ans = ians + "";
        if(ans.length()<num.length()){
            for(int i = 0; i < num.length() - ans.length(); i++){
                ans += "0";
            }
        }
    }
    else {
        ans = num;
    }
    if(dot > 0){
        ans = ans.substring(0,1) + "." + ans.substring(1,ans.length());
    }
    
    System.out.print("입력한 수와, 그 수에 가장 가까운 10의 배수의 차이는\n");
    System.out.print(ans);
    System.out.print("입니다.");

}
}