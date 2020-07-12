package PracticeNumberSum;

//프로그래머스 lv1 - 두 정수 사이의 합
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();


    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) {
            answer = a;
            return answer;
        } else if( a < b) {
            for(int i = a; i <= b; i++) {
                answer += i;
            }
            return answer;
        } else {
            for(int i = a; i >= b; i--) {
                answer += i;
            }
        }

        return answer;
    }
}
