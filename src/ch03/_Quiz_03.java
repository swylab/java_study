package ch03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오.
        String id = "000101-1234567";

        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0, id.indexOf("-") + 2));
    }
}
