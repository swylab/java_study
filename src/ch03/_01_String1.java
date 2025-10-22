package ch03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        
        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("JavaScript"));   // false
        System.out.println(s.indexOf("Java"));  // 7
        System.out.println(s.indexOf("JavaScript"));    // -1 (포함되지 않는다면)
        System.out.println(s.indexOf("and"));   // 12 (처음)
        System.out.println(s.lastIndexOf("and"));   // 23 (마지막)
        System.out.println(s.startsWith("I love")); // false
        System.out.println(s.endsWith("."));    // true ("." 으로 끝난다.)
    }
}
