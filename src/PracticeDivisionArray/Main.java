package PracticeDivisionArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//프로그래머스 lv1 - 나누어 떨어지는 숫자 배열
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {5,9,7,10};
        int divisor = 5;
        int[] result = solution.solution(arr,divisor);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));

    }
}

class Solution {

    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        for(int result : arr) {
            if(result%divisor == 0) {
                list.add(result);
            }
        }

        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            Collections.sort(list);
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

        }
        return answer;
    }
}
