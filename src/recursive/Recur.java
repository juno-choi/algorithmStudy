package recursive;

/**
 * 재귀 알고리즘 분석을 위한 코드
 */
public class Recur {
    public static void main(String[] args) {
        int n = 4;
        recur(4);
    }
    static void recur(int n){
        if(n>0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }
}
