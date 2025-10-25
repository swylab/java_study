package ch04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If else
        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 + 1");
        }
        else {
            System.out.println("디카페인 아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #1");

        hour = 15;
        boolean mornigCoffee = true;
        if (hour > 14 || mornigCoffee == true) {
            System.out.println("디카페인 아이스 아메리카노 + 1");
        }
        else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
