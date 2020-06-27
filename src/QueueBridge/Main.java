package QueueBridge;

import java.util.LinkedList;
import java.util.Queue;

//Queue - 다리를 지나는 트럭
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int bridgeLength = 2;
        int weight = 10;
        int[] truckWeights = {7,4,5,6};
        int answer = solution.solution(bridgeLength, weight, truckWeights);
        System.out.println("트럭이 모두 다리를 지나간시간은 : " + answer);

    }
}

class Solution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;                                 //트럭이 다리를 모두 통과하는데 걸리는 시간
        Queue<Truck> birdge = new LinkedList<>();
        int lastEnterTruckIndex = 0;                    //다리에 집인한 트럭 인덱스
        int amountTruckIndex = truck_weights.length;    //트럭의 총 개수, 반복문에서 마지막 인덱스까지 반복하기 위해 선언;
        int currentBridgeWeight = 0;                    //현재 다리 무게

        while(lastEnterTruckIndex < amountTruckIndex) {
            answer++;

            if(!birdge.isEmpty()){
                Truck frontTruck = birdge.peek();                           //가장 먼저 들어간 트럭을 반환
                if(answer - frontTruck.innerTime == bridge_length){         //현재시간 - 다리진입시간 = 다리의길이
                    currentBridgeWeight -= frontTruck.weight;               //현재다리의 무게에서 트럭의 무게를 제외한다.
                    birdge.poll();                                          //가장 먼더 들어간 트럭을 list 에서 삭제한다.
                }
            }

            int currentTruckWeight = truck_weights[lastEnterTruckIndex];    //현재 트럭의 무게
            if(currentBridgeWeight + currentTruckWeight <= weight) {
                birdge.offer(new Truck(currentTruckWeight, answer));
                lastEnterTruckIndex++;
                currentBridgeWeight += currentTruckWeight;
            }
        }
        return answer += bridge_length;                                     //마지막트럭이 다리를 지난시간은 while 에서 계산하지 않아서 다리의길이만큼 더해준다.
    }

}

//트럭 클래스 정의
class Truck {
    public int weight;                          //트럭 무게
    public int innerTime;                       //트럭이 다리에 진입한 시간
    public Truck(int weight, int innerTime) {   //생성자로 무게, 진입시간을 초기화
        this.weight = weight;
        this.innerTime = innerTime;
    }
}
