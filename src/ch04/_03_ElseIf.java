package ch04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 Else if
        // 한라봉 에이드가 있으면 + 1
        // 또는 망고 주스가 있으면 + 1
        // 또는 아이스 아메리카노 + 1
        
        boolean hanlabong = true;
        boolean mango = true;

        if (hanlabong) {
            System.out.println("한라봉 에이드 + 1");
        }
        else if (mango) {
            System.out.println("망고 주스 + 1");
        }
        else {
            System.out.println("아이스 아메리카노");
        }
        System.out.println("커피 주문 완료 #1");

        hanlabong = false;
        mango = false;
        boolean orange = true;

        if (hanlabong) {
            System.out.println("한라봉 에이드 + 1");
        }
        else if (mango) {
            System.out.println("망고 주스 + 1");
        }
        else if (orange) {
            System.out.println("망고 주스 + 1");
        }
        else {
            System.out.println("아이스 아메리카노");
        }
        System.out.println("커피 주문 완료 #2");
    }
}

