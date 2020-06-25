package HashCamouflage;

import java.util.HashMap;

//해시 - 위장
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer = solution.solution(clothes);
        System.out.println("위장 횟수 : " + answer);

    }
}

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> hashMap = new HashMap();
        for(String[] wear : clothes){
            hashMap.put(wear[1],hashMap.getOrDefault(wear[1],1)+1);
        }
        answer = 1;
        for(String key : hashMap.keySet()) {
            answer *= hashMap.get(key);
        }

        return answer - 1;
    }
}
