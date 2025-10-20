package ch01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "우영";
        //String name = "우영"
        int hour = 15;

        System.out.println(name + "님, 배송이 시작되었습니다. " + hour +"시에 도착 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "백호";
        
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");
    }

}
