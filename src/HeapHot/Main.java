package HeapHot;

import java.util.PriorityQueue;
import java.util.Queue;

//Heap - 더 맵게
public class Main {

    public static void main(String[] args) {

        int[] scrovile = {1,2,3,9,10,12};
        Solution solution = new Solution();
        int result =solution.solution(scrovile,7);
        System.out.println(result);


    }
}

class Solution {

    public int solution(int[] scrovile, int K) {
        int answer = 0;
        boolean amount = true;
        Queue<Integer> queue = new PriorityQueue<>();                   //힙 자료구조를 구현한 Queue 저장된 값을 자동으로 정렬된다.

        for(int scr : scrovile) {
            queue.add(scr);
        }

        while(amount) {

            int scrovileSum = queue.poll() + (queue.poll()*2);
            queue.offer(scrovileSum);
            answer++;
            if(queue.peek() > K) {
                amount = false;
            }
            if(queue.size() == 1 && queue.peek() < K) {
                answer = -1;
                amount = false;
            }
        }
        return answer;
    }
}
