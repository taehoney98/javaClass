public class StringExample {
    public static void main(String[] args) {
        // 문자열 직접 할당
        String greeting = "안녕하세요";
        System.out.println(greeting);
        
        // new 키워드를 사용하여 문자열 객체 생성
        String name = new String("Java 사용자");
        //String name = "Java 사용자"; 동일
        System.out.println(name);
        
        // 문자 배열을 사용하여 문자열 생성
        char[] charArray = {'j','a','v','a',' ','프','로','그','래','머'};
        String programmer = new String (charArray);
        System.out.println(programmer);
        
        
        //문자열 연결
        String fullName = "Kim"+" "+"Young";
        System.out.println(fullName);
        
        // StringBulider 를 사용하여 문자열 생성 및 연결
        StringBuilder sb = new StringBuilder();
        sb.append("문자열");
        sb.append("생성");
        sb.append("예제");
        String result = sb.toString();
        System.out.println(result);
    }
}
