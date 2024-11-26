public class StringCompareExample {
    public static void main(String[] args) {
        // 두 문자열 변수 초기화
        String firstString = "Hello World";
        String secondString = "Hello World";
        String thirdString = "Hello world"; // 대소문자 구분을 위해 다른 케이스 사용

        // compareTo 메서드를 사용하여 두 문자열 비교
        int comparisonResult = firstString.compareTo(secondString);
        // compareTo는 같으면 0, 다르면 0이 아닌 값을 반환
        System.out.println("firstString과 thirdString 비교: "+ comparisonResult);
        // compareTo는 문자열이 끝날때 까지 앞에서 하나씩 비교해서 같으면 0

        //equals 메서드를 사용하여 두 문자열 비교
        boolean equalsResult = firstString.equals(secondString);
        // equals 는 같으면 true , 다르면 false를 반환
        System.out.println("firstString과 thirdString이 같음: " + equalsResult);
        // 같냐 다르냐만 측정해 true

        // compareTo와 equals를 다른 문자열과 비교
        comparisonResult = firstString.compareTo(thirdString);
        equalsResult = firstString.equals(thirdString);

        System.out.println("firstString과 thirdString 비교: "+ comparisonResult);
        System.out.println("firstString과 thirdString이 같음: " +equalsResult);
    }
}
