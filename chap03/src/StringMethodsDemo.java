import java.util.Locale;

public class StringMethodsDemo {
    public static void main(String[] args) {
        //초기 문자열
        String originalString =" Java Programming ";

        // substring 메서드를 사용하여 부분 문자열 추출
        String subString = originalString.substring(5);
        System.out.println(subString);  // "Programming "

        // toLowerCase 메서드를 사용하여 문자열을 소문자로 전환
        String lowerCaseString = originalString.toLowerCase(); // " java programming"
        System.out.println(lowerCaseString);

        // toUpperCase 메서드를 사용하여 문자열을 대문자로 전환
        String upperCaseString = originalString.toUpperCase();
        System.out.println(upperCaseString); //  " JAVA PROGRAMMING"

        //trim 메서드를 사용하여 양쪽 공백 제거
        String trimmedString = originalString.trim();
        System.out.println(trimmedString); // "java Programming"
    }
}
