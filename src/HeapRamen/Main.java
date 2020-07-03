package HeapRamen;

import java.util.Collections;
import java.util.PriorityQueue;

//Heap - 라면공장
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int stork = 4;
        int[] dates = {0,10,15};
        int[] supplies = {26,5,6};
        int k = 30;
        int result = solution.solution(stork, dates, supplies, k);
        System.out.println("결과는 = " + result);

    }
}

class Solution {

    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int today = 0;
        int index = 0;

        PriorityQueue<Integer> suppliesQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer result : supplies) {
            suppliesQueue.offer(result);
        }

        while(today < k) {

            if(today == dates[index]) {
                stock += suppliesQueue.poll();
                index++;
                answer++;
            }

            if(stock >= (k - today)) {
                break;
            }
            stock--;
            today++;
        }

        return answer;
    }
}

