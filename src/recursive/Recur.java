package recursive;

import java.util.Stack;

/**
 * 재귀 알고리즘 분석을 위한 코드
 */
public class Recur {
    public static void main(String[] args) {
        int n = 4;
        //recur(4);
        //recur2(4);
        recur3(4);
    }
    static void recur(int n){
        if(n>0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

    //재귀의 꼬리 제거
    static void recur2(int n){
        while(n>0){
            recur2(n-1);
            System.out.println(n);
            n=n-2;
        }
    }
    
    //stack을 이용하여 비재귀로 구현
    static void recur3(int n){
        Stack<Integer> stack = new Stack<>();

        while(true){
            if(n>0){              //n이 0이될때까지 stack에 push
                stack.push(n);
                n=n-1;
                continue;
            }
            if(!stack.isEmpty()){   //stack이 비어있지 않으면 stack을 모두 소비할때까지 진행
                n = stack.pop();
                System.out.println(n);
                n=n-2;
                continue;
            }
            break;
        }
    }
}
