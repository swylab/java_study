package ch04;

public class _10_Break {
    public static void main(String[] args) {
        int max = 20;
        for (int i = 1; i <= 50; i++){
            System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }

        System.out.println("-------------");

        int index = 1;
        while (index <= 50) {
            System.out.println(index +"번 손님, 주문하신 치킨 나왔습니다.");
            if (index == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
    }
}
