public class Demo {
    // 클래스 필드
    int field;

    public void showDiff(){
        // 메서드 지역변수
        int field =7;

        // 클래스 필드에 지역변수의 값을 할당
        this. field = field;

        System.out.println("클래스 필드: " + this.field); // 출력: 클래스 필드 : 7
        System.out.println("메서드 지역변수: "+ field);// 출력: 메서드 지역변수 : 7


    }

    public void changeField(int field){
        // 다른 메서드에서 클래스 필드의 값을 변경
        this.field = field;

        // local 변수는 여기서 접근 할수 x (showDiff 메서드 내에서만 존재)
    }


    public static void main(String[] args) {
        Demo demoInstance = new Demo();
        demoInstance.showDiff();
        demoInstance.changeField(50);

        // 필드값은 클래스 전체에서 유지되므로 변경된 값이 출력됨
        System.out.println("변경된 클래스 필드:" + demoInstance.field); // 출력: 변경된 클래스 필드: 10
    }
}
