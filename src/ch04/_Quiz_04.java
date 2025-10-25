package ch04;

public class _Quiz_04 {
    public static void main(String[] args) {
        /* 
        주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        경차 또는 장애인 차량은 최종 요금에서 50% 할인
        일반차랑 5시간 주차 시 20000원
        경차 5시간 주차 시 10000원
        장애인 차량 10시간 주차 시 15000원
        */

        int hour = 10;   // 주차 시간
        boolean isSmallCar = false; // 경차
        boolean withDisabledPerson = true; // 장애인 차량 여부 
        int max = 30000;
        
        int sum = hour * 4000;  // 주차 정산 요금

        // 최대 요금 30000원
        if (sum > 30000){
            sum = 30000;
        }
        // 경차 또는 장애인 차량 할인
        if (isSmallCar == true || withDisabledPerson == true){
            sum = sum/2;
        }
        System.out.println(sum + "원 정산되었습니다.");
    }
}
