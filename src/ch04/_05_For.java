package ch04;

public class _05_For {
    public static void main(String[] args) {
        // for (선언 ; 조건 ; 증감)
        for ( int i = 0 ; i < 10 ; i++) {
            System.out.println("어서오세요. 나코입니다." + i);
        }

        // 짝수만 출력
        for ( int i = 0 ; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 홀수만 출력
        for ( int i = 1 ; i < 10 ; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 5->4->3->2->1
        for (int i = 5 ; i>0 ; i-- ){
            System.out.print(i);
        }
        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 10; i++){  
            sum += i;
            System.out.println("현재까지 총 합은 " + sum + "입니다.");
        }
        System.out.println(sum);
    }
}
