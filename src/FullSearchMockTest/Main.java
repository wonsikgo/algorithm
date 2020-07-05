package FullSearchMockTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//완전탐색 - 모의고사
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] answers = {1,3,2,4,2};
        int[] result = solution.solution(answers);
        Arrays.stream(result).forEach(e -> System.out.print(e + ","));

    }
}

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        //학생 마다 점수를 매치 시키기 위해 HashMap선언
        HashMap<Integer,Integer> score = new HashMap<>();
        score.put(1,0);
        score.put(2,0);
        score.put(3,0);

        //학생마다 배열 길이가 다른 부분을 나머지 연산을 통해 해결, 값이 같으면 HashMap 에 1씩 추가
        for(int i = 0; i < answers.length; i++) {
            if(student1[i%5] == answers[i]) score.put(1, score.get(1) + 1);
            if(student2[i%8] == answers[i]) score.put(2, score.get(2) + 1);
            if(student3[i%10] == answers[i]) score.put(3, score.get(3) + 1);
        }

        //최대값을 구함
        int max = Math.max(score.get(1), Math.max(score.get(2), score.get(3)));

        //ArrayList 를 통해 최대값보다 크거나 같으면 list 에 추가
        ArrayList<Integer> list = new ArrayList<>();

        for(int result : score.keySet()) {
            if(max <= score.get(result)) {
                list.add(result);
            }
        }

        //배열에 list 값을 첨부
        int[] answer = new int[list.size()];
        for(int i = 0; i< list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
