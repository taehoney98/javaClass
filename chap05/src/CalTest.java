class Calc {
    private double res; // 인스턴스 변수
    static final double Pi = 3.14159; //정적 상수

    //인스턴스 메서드 : 원의 넓이 계산
    public double area (double rad){
        res = Pi * rad * rad; //인스턴스 변수에 결과 저장
        return res;
    }

    public double getRes() {
        return res;
    }

    // 정적 메서드: 원의 둘레 계산
    public static double circ(double rad){
        // res 접근 불가: 정적이 아니니깐 ! 정적인 Pi는 접근 가능
        return 2 * Pi * rad; // 직접 정적 변수 사용
    }
}


public class CalTest{
    public static void main(String[] args) {
        Calc calc = new Calc(); // Calc 인스턴스 생성

        double result = calc.area(10); // 인스턴스 메서드 호출
        System.out.println(result);

        double c = Calc.circ(10); // 정적 메서드 호출


        System.out.println("넓이: " + result);
        System.out.println("둘레: " + c);

    }
}
