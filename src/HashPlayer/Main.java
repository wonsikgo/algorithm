package HashPlayer;

import java.util.HashMap;

//해시 - 완주하지 못한 선수
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String answer = solution.solution(new String[]{"marina", "josipa", "nikola","vinko","filipa"}, new String[]{"josipa", "filipa","marina","nikola"});
        System.out.println("완주하지 못한 선수 : " + answer);

    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String,Integer> hashMap = new HashMap();
        for(String people : participant){
            hashMap.put(people, hashMap.getOrDefault(people,0)+1);
        };
        for(String people : completion) {
            hashMap.put(people, hashMap.get(people)-1);
        };
        for(String people : hashMap.keySet()) {
            if(hashMap.get(people) != 0) {
                answer = people;
            }
        }

        return answer;
    }



}
