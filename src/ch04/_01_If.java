package ch04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; // 오전 10시
        if (hour < 14){
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷 추가");
        }   
        
        hour = 10;
        boolean mornigCoffee = false;
        if (hour < 14 && mornigCoffee == false){
            System.out.println("아이스 아메리카노 + 1");
        }
        
        hour = 15;
        mornigCoffee = true;
        if (hour >= 14 || mornigCoffee == true){
            System.out.println("디카페인 아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료");
    }
}
