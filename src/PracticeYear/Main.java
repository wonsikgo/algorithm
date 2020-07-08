package PracticeYear;

//연습문제 lv1 - 2016년
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int a = 11, b = 7;
        String result = solution.solution(a,b);
        System.out.println(result);

    }
}

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int count = b;

        for(int i = 1; i < a; i++){
            if(i < 8) {
                if(i%2 == 0){
                    if(i == 2){
                        count += 29;
                    }else {
                        count += 30;
                    }
                } else {
                    count += 31;
                }
            } else {
                if(i%2 == 0){
                    count += 31;
                } else {
                    count += 30;
                }
            }
        }
        return answer = week[count%7];
    }
}
