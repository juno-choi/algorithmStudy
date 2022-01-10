package search;

/**
 * 이진 검색
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int key = 3;

        System.out.println("binSearch = "+binSearch(arr, n, key));
    }

    static int binSearch(int[] a, int n, int key){
        int pl = 0;     //검색 범위 첫 인덱스
        int pr = n-1;   //검색 범위 끝 인덱스

        do{
            int pc = (pl+pr)/2;  //중앙 인덱스
            if(a[pc]==key) return pc;   //검색 성공
            else if(a[pc]<key)  pl=pc+1;    //key값 보다 작을경우 검색 범위를 뒤쪽 절반으로 줄임
            else pr = pc-1;                 //key값 보다 클 경우 검색 범위를 앞쪽 절반으로 줄임
        }while(pl<=pr);

        return -1;  //검색 실패
    }
}
