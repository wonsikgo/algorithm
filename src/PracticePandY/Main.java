package PracticePandY;

//프로그래머스 lv1 - 문자열 내 p와 y의 개수
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
//        String s = "pPoogyY";
        String s = "Pyy";
        boolean result = solution.solution(s);
        System.out.println("결과는 : " + result);

    }
}

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        String lowerCase = s.toLowerCase();

        for(int i = 0 ; i < s.length(); i++) {
            if(lowerCase.charAt(i) == 'p') {
                pCount++;
            } else if(lowerCase.charAt(i) == 'y') {
                yCount++;
            }
        }

        if(pCount != yCount) {
            answer = false;
        }
        return answer;
    }
}
