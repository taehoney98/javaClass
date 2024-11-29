
// 인터페이스 예제 코드
public interface MyInterface {
    //모든 인터페이스 변수는 public static final 이어야 하므로,
    // 아래 변수 MAx는 public static final int Max = 10; 으로 컴파일 함.
    int MAX = 10;
    
    // 인터페이스 메소드는 기본적으로 public abstact 이어야 함
    void sayHello();
}

// MyInterface를 구현하는 클래스
class MyClass implements MyInterface{
    
    // 인터페이스의 추상메서드 구현
    @Override
    public void sayHello() {
        System.out.println("안녕하세요, 최대값은 "+ MAX);
    }
}