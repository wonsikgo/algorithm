package PracticeMiddleLetter;

//프로그래머스 lv1 - 가운데 글자 가져오기
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = "abcde";
//        String s = "qwer";
        String result = solution.solution(s);
        System.out.println("결과는 : " + result);

    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2 == 0) {
            answer = "" + s.charAt(s.length()/2-1) + s.charAt(s.length()/2);
        } else {
            answer += s.charAt((int) Math.floor(s.length()/2));
        }
        return answer;
    }
}
