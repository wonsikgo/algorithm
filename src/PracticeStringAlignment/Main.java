package PracticeStringAlignment;

import java.util.Arrays;
import java.util.Collections;

//프로그래머스 lv1 - 문자열 내림차순으로 배치하기
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = "Zbcdefg";
        String result = solution.solution(s);
        System.out.println("결과는 : " + result);

    }
}

class Solution {
    public String solution(String s) {
        String[] arrays = s.split("");
        Arrays.sort(arrays, Collections.reverseOrder());
        return String.join("",arrays);
    }
}
