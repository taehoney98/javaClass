// 추상 클래스를 정의하는 예제

abstract class Shape{
    int x, y;

    // 이 메서드는 추상 메서드로 하위 클래스에서 반드시 궇ㄴ해야함
    abstract void draw();
}

// Shape 클래스를 상속받는 구체적인 클래스
class Circle1 extends Shape{

    private double radius;

    Circle1(double r){
        this.radius=r;
    }

    // draw 메서드를 구현함으로써 Circle클래스는 더이상 추상 클래스가 아님
    @Override
    void draw() {
        System.out.println("원을 그림, 반지름; " + radius);
    }
}

// 추상 클래스 사용을 위한  실행 클래스
public class AbstractMain {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(10);
        circle.draw(); // 구체적인 도형 객체를 사용하여 draw 메서드 호출
    }
}
