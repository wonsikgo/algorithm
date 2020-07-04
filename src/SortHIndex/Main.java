package SortHIndex;

import java.util.Arrays;

//정렬 - H-Index
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] citations = {3,0,6,1,5};
//        int[] citations = {32,12,33,10,1,5,13};
        int[] example = {123,423,4234,123,22,3,4,1,25453,234,2341,234,88,65};
        int[] example2 = {1,2,3,4,5,6,7,8,9,10};
        int result = solution.solution(example2);
        System.out.println("결과 값 : " +  result);

    }
}

class Solution {

    public int solution(int[] citations) {
        int answer = citations.length;
        Arrays.sort(citations);

        for(int result : citations) {
            if(result >= answer) {
                break;
            }
            answer--;
        }
        return answer;
    }
}
