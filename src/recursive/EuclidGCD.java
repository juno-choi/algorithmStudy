package recursive;

/**
 * 재귀로 최대공약수 구하기 = 유클리드 호제법
 */
public class EuclidGCD {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int gdc = gdc(x, y);
        System.out.println("gdc = " + gdc);
    }
    static int gdc(int x, int y){
        if( y== 0) return x;
        else return gdc(y, x % y);
    }
}
