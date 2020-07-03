package ArrayGreatNumber;

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

        for(int i = 0; i < numberString.length; i++) {
            for(int j = 0; j < numberString.length - i - 1; j++) {
                int firstNumber = numberString[j].charAt(numberString[j].length()-1);
                int secondNumber = numberString[j+1].charAt(numberString[j+1].length()-1);
                if(firstNumber < secondNumber){
                    String temp;
                    temp = numberString[j+1];
                    numberString[j+1] = numberString[j];
                    numberString[j] = temp;
                }
            }
        }

        for(String result : numberString) {
            answer += result;
        }


        return answer;
    }
}
