package PracticeStringSort;

import java.util.Arrays;
import java.util.Comparator;

//프로그래머스 lv1 - 문자열 내 마음대로 정렬하기
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
//        String[] strings = {"sun", "bed", "car"};
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] result = solution.solution(strings, n);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));

    }
}

class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char e1 = o1.charAt(n);
                char e2 = o2.charAt(n);

                if(e1 > e2) return 1;
                else if(e1 < e2) return -1;
                else return o1.compareTo(o2);

            }
        });

        return strings;
    }
}