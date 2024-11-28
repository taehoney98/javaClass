public class Person1 {
    private String name;
    private int age;

    private Person1(){}
    private static Person1 getInstace(){
        return new Person1();
    }
    //이름 설정 메서드 , 반환형은 Person 객체
    public Person1 setName(String name){
        this.name = name;
        return this; // 현재 객체를 반환
    }

    // 나이 설정 메서드 , 반환형은 Person 객체
    public Person1 setAge(int age){
        this.age =age;
        return this;
    }
// 인사 메서드
    public void hello(){
        System.out.println("안녕 , 나는 "+ name +"이고 "+ age +"살이야");
    }

    // 메인 메서드
    public static void main(String[] args) {
        Person1 person =Person1.getInstace(); // Person 객체 생성
        person.setName("민규").setAge(21).hello(); //메서드 체이닝으로 송성 설정 후 인사
    }
}
