class Prod{
    int id;
    String nm; // 이름

    // 생성자
    Prod( int i , String n){
        id =i;
        nm =n;
    }


    //정보 출력 메서드
    void  info(){
        System.out.println(id +":" + nm);
    }
}

// 상속받은 확장 클래스
class ExtProd extends Prod{
    int qty;

    // 확장 클래스의 생성자
    ExtProd( int i , String n, int q){
        super(i,n); // 상위 클래스의 생성자 호출
        qty =q;
    }

    // 오버라이드한 정보 출력 메서드
    @Override
    void info(){
        super.info(); // 상위 클래스 메서드 호출
        System.out.println("수량: " +qty);
    }
}

// 실행 클래스

public class ProdTest {
    public static void main(String[] args) {
        Prod p  = new Prod( 1,"Pen");
        ExtProd ep = new ExtProd(2 , "NoteBook", 10);

        p.info(); // "1:Pen"
        ep.info(); // "2:Notebook" , "수량:10"
    }
}
