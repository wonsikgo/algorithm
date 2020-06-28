package StackTop;

import java.util.Stack;

//Stack - 탑
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] heights = {6,9,5,7,4};
        int[] answer = solution.solution(heights);
        for(int result : answer) {
            System.out.println("배열 : " + result);
        }

    }
}

class Solution {
    //단순 2중 for문을 활용
//    public int[] solution(int[] heights) {
//        int heightsLength = heights.length - 1;
//        int[] answer = new int[heights.length];
//
//        for(int i = heightsLength; i >= 0; i--) {
//            for(int j = i - 1; j >=0; j--) {
//                if(heights[i] < heights[j]) {
//                    answer[i] = j + 1;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }

    //스택을 화용한 풀이
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Tower> stack = new Stack<>();

        for(int i = 0 ; i < heights.length; i++) {
            Tower tower = new Tower(i+1, heights[i]);
            int answerIndex = 0;

            while (!stack.empty()) {
                Tower top = stack.peek();
                                                    //6,9,5,7,4
                if(top.height > tower.height) {     //바로 전에 삽입된 타워 높이 > 최신 타워 높이
                    answerIndex = top.index;        //타워의 인덱스를 대입
                    break;
                }
                stack.pop();                        //가장 최근에 들어갔던 요소를 제거
            }
            stack.push(tower);
            answer[i] = answerIndex;
        }

        return answer;
    }
}

class Tower {
    int index;
    int height;

    public Tower(int index, int height) {
        this.index = index;
        this.height = height;
    }
}