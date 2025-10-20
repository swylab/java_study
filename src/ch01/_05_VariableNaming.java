package ch01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능
        // 3. 밑줄 또는 문자로 시작 가능 (숫자는 불가)
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "현성";
        String lastName = "김";
        String dateOfBirth = "2000-01-01";
        String residentialAddress = "호텔";
        String purposeOfVisit = "관광";
        String filightNo = "KE666";
        String _filightNo = "KE666";

        int accompany = 2;
        int lengthOfStay = 5;

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
