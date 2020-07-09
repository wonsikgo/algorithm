package PracticeEqualNumber;

import java.util.Arrays;
import java.util.Stack;

//연습문제 lv1 - 같은 숫자는 싫어
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
//        int[] arr = {1,1,3,3,0,1,1};
        int[] arr = {4,4,4,3,3};
        int[] result = solution.solution(arr);
        Arrays.stream(result).forEach(e-> System.out.print(e + ""));

    }
}

class Solution {

    public int[] solution(int []arr) {
        Stack<Integer> list = new Stack<>();
        for(int i = 0 ; i < arr.length; i++) {
            if(i == 0) {
                list.push(arr[i]);
            } else if(list.peek() != arr[i]) {
                list.push(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
