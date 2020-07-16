package PracticeStringBasis;

//프로그래머스 lv1 - 문자열 다루기 기본
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
//        String s = "1234";
        String s = "a234";
        boolean result = solution.solution(s);
        System.out.println("결과는 : " + result);


    }
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        if(length != 4 && length != 6) {
            answer = false;
            return answer;
        }
        for(int i = 0; i < length; i++){
            if(s.charAt(i) > '9') {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
