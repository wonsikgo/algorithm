package WorkoutClothes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//탐욕법 - 체육복
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int n = 5;
        int[] lost = {2,4};
//        int[] lost = {3};
        int[] reserve = {1,3,5};
//        int[] reserve = {1};

        int result = solution.solution(n, lost, reserve);
        System.out.println("결과는 : " + result);

    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        ArrayList<Integer> reserveList = new ArrayList<>();
        ArrayList<Integer> lostList = new ArrayList<>();

        for(int lostResult : lost) lostList.add(lostResult);                    //읽어버린 학생 수
        for(int reserveResult : reserve) reserveList.add(reserveResult);        //여벌 옷 가져온 학생 수


        for(int i = 0; i < lostList.size(); i++) {
            for(int j = 0; j < reserveList.size(); j++) {
                if(lostList.get(i) == reserveList.get(j)){
                    lostList.remove(i);
                    reserveList.remove(j);
                    i--;
                    answer++;
                    break;
                }
            }
        }

        for(int i = 0; i < lostList.size(); i++) {
            for(int j = 0; j< reserveList.size(); j++) {
                if(lostList.get(i)-1 == reserveList.get(j) || lostList.get(i)+1 == reserveList.get(j)) {
                    answer++;
                    reserveList.remove(j);
                    break;
                }
            }
        }

        return answer;
    }
}
