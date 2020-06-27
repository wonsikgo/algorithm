package QueueTop;

//Stack - 탑
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] heights = {6,9,5,7,4};
        int[] answer = solution.solution(heights);
        for(int result : answer) {
            System.out.println("배열 : " + result);
        }

    }
}

class Solution {
    public int[] solution(int[] heights) {
        int heightsLength = heights.length - 1;
        int[] answer = new int[heights.length];

        for(int i = heightsLength; i >= 0; i--) {
            for(int j = i - 1; j >=0; j--) {
                if(heights[i] < heights[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}
