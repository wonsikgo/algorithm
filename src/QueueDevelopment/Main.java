package QueueDevelopment;

import java.util.*;

//Queue - 기능개발
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] progresses = {93,30,5};
        int[] speeds = {1,30,5};
        int[] answer = solution.solution(progresses, speeds);
        for(int result : answer) {
            System.out.println(result);
        }

    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> result = new LinkedList<>();
        int[] progressesClone = progresses;             //복사본
        int count = 0;                                  //한 번에 배포되는 수
        int complete = 0;                               //총 배포량

        while(complete < progressesClone.length) {
            for(int i = 0; i < progressesClone.length; i++) {       //모두 증가 처리
                progressesClone[i] += speeds[i];
            }

            if(progressesClone[complete] >= 100) {
              while(complete < progressesClone.length && progressesClone[complete] >=100) { //같이 배포할 수 있는 작업을 찾는다.
                  count++;
                  complete++;
              }

              result.offer(count);
              count = 0;
            }
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i <answer.length; i++) {
            answer[i] = result.poll();
        }

        return answer;
    }
}
