class Rect {
    private double w; // 너비
    private  double h; // 높이

    //디폴트 생성자
    public Rect(){
        this(1.0,1.0);
    }

    // 생서자 오버로딩 : 너비와 높이를 받는 생성자
    public Rect(double width , double height){
        this.w = width;
        this.h = height;

    }


    // 너비와 높이를 출력하는 메서드
    public void  printSize(){
        //System.out.println("너비:"+ w + "높이:"+h);
        this.printSize("이름없음");
    }
    public  void printSize(String n){
        System.out.println( n+"이 입력한 너비:"+w+"높이:"+h);
    }
}


public  class RectTest{
    public static void main(String[] args) {
        Rect r1 = new Rect(); //디폴트 생성자 사용
        Rect r2 = new Rect(2.0,3.0); // 너비와 높이를 인수로 받는 생성자 사용

        r1.printSize(); // 디폴트 생성자에 의해 설정된 값 출력
        r2.printSize("Kim"); // 설정된 너비와 높이 값 송출
    }
}
