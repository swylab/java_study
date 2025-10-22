package ch03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));  // false
        System.out.println(s1.equals("Java"));  // true

        // 대소문자 구분 없이 확인
        System.out.println(s2.equalsIgnoreCase("python"));  // true

        // 문자열 비교 심화 ex) 식당 벽에 붙은 메모지의 비밀번호 정보
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2));  // true (내용)
        System.out.println(s1 == s2);   // true (참조)

        // new String 서로 다른 메모지 
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s2);   // false
    }
}
