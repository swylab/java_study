package ch01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
    
        // 정수형 -> 실수형
        int score = 93;
        System.out.println(score);  // 93
        System.out.println((float)score);   // 93.0
        System.out.println((double)score);  // 93.0

        // 실수형 -> 정수형
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);   // 93
        System.out.println((int)score_d);   // 98

        // 93 + 98.8
        int sum = score + (int)score_d;
        System.out.println(sum);    // 191

        double sum_d = (double)score + score_d;
        System.out.println(sum_d);  // 191.8

        // int -> long -> float -> double (자동 형변환)
        // double -> float -> long -> int (수동 형변환)


        // 숫자를 문자열로 (String.valueOf)
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        // error
        // int error = Integer.parseInt("java");
        
    }
}
