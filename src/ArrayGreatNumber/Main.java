package ArrayGreatNumber;

import java.util.Arrays;
import java.util.Collections;

//정렬 - 가장 큰 수
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
//        int[] numbers = {6,10,2};
        int[] numbers = {3,30,34,5,9};
        String result = solution.solution(numbers);
        System.out.println("결과 값 : " + result);

    }
}

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] numberString = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            numberString[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numberString, (a,b)->(b+a).compareTo(a+b));     //compareTo 값이 양수면 앞,뒤 값을 교체 ex)30+3와 3+30인경우 30+3이 작아서 -1을 리턴
                                                                    //ex) 34+30와 30+34는 34+30이 더 크기 때문에 앞, 뒤 값 교체

        if(numberString[0].equals("0")) {
            return "0";
        }

        for(String result : numberString) {
            answer += result;
        }


        return answer;
    }
}
