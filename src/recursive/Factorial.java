package recursive;

/**
 * 재귀로 팩토리얼 구하기
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        int factorial = factorial(n);
        System.out.println("factorial = " + factorial); //3일 경우 답은 6
    }
    static int factorial(int n){
        if(n>0) return n * factorial(n-1);
        else return 1;
    }
}
