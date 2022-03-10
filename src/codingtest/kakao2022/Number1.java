package codingtest.kakao2022;

import java.util.*;

/*
문제 (https://programmers.co.kr/learn/courses/30/lessons/92334?language=java)
 */
public class Number1 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int  k= 2;
        int[] solution = solution(id_list, report, k);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set> map = new LinkedHashMap<>();

        //유저 아이디를 담을 각 자료구조 생성
        for(String id : id_list){
            map.put(id, new HashSet());
        }

        for(String repo : report){
            String[] s = repo.split(" ");
            //신고 계정 넣기
            map.get(s[1]).add(s[0]);
        }

        int[] answer = new int[id_list.length];

        for(String key : map.keySet()){
            if(map.get(key).size() >= k){
                Iterator iterator = map.get(key).iterator();
                while(iterator.hasNext()){
                    String id = String.valueOf(iterator.next());
                    answer[Arrays.asList(id_list).indexOf(id)]++;
                }
            }
        }

        return answer;
    }
}
