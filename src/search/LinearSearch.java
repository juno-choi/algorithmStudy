package search;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int key = 3;

        System.out.println("search1 = "+search1(arr, n, key));
        System.out.println("search2 = "+search2(arr, n, key));
        System.out.println("search3 = "+search3(arr, n, key));
    }
    //while을 통한 검색
    static int search1(int[] arr, int n, int key){
        int i = 0;
        while (true){
            if(i==n) return -1;
            if(arr[i] == key) return i;
            i++;
        }
    }

    //for문을 통한 검색
    static int search2(int[] arr, int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i] == key) return i;
        }
        return -1;
    }

    //보초법 (성능향상)
    static int search3(int[] arr, int n, int key){
        int[] arr2 = Arrays.copyOf(arr, n+1);
        arr2[n] = key;

        int i = 0;
        while(true){
            if(arr2[i] ==key) break;
            i++;
        }

        return i == n ? -1 : i ;
    }
}
