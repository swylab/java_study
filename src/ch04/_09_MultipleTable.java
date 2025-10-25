package ch04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        for(int i = 1; i <= 9; i++){
            System.out.println(i + "단 결과");
            for(int j = 1; j <= 9; j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
