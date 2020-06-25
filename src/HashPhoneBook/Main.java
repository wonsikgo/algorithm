package HashPhoneBook;

//해시 - 전화번호 목록
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] phoneBook = {"119", "97674223", "1195524421"};
        boolean answer = solution.solution(phoneBook);
        System.out.println("전화번호 : " + answer);

    }
}

class Solution {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book.length; j++){
                if(!phone_book[i].equals(phone_book[j]) && phone_book[i].contains(phone_book[j])) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

}
