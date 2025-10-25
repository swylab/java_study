package ch04;

public class _04_SwithCase {
    public static void main(String[] args) {
        // 석차에 따른 장학금 지급

        // If else 문 이용
        int ranking = 4;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        }
        else if (ranking == 2) {
            System.out.println("반액 장학금");
        }
        else if (ranking == 3) {
            System.out.println("반액 장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문 이용
        ranking = 2;
        switch(ranking){
            case 1: 
                System.out.println("전액 장학금"); 
                break;
            case 2: 
                System.out.println("반액 장학금"); 
                break;
            case 3: 
                System.out.println("반액 장학금"); 
            /*
            break를 안넣게 되면 case 2 -> 3도 실행된다. 
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
             */
                break;
            default: 
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 중고상품의 등급에 따른 가격
        int grade = 1;
        int price = 7000; 
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade +"등급 제품의 가격 : " + price + "원");
    }
}
