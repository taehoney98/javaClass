public class CalculationDemo {
    public static void main(String[] args) {
        int i ;
        long l ;
        double d;
        i = 5/2;
        System.out.println("5/2: " + i);  // 2

//
//        d = 5/2;
//        System.out.println(("5/2: "+d)); //2.5
        // 1
        d = (float) 5 / (float) 2 ;
        System.out.println("5/2: "+ d); // 2.2
        // 2
        d = 5.0 /2.0;
        System.out.println(("5/2:"+ d)); //2.5


        // 오버플로 발생
        i = 10000000 * 10000000;
        System.out.println(i);

        // 형변환
        l= 10000000 * (long) 10000000;
        System.out.println(l);
        // 접미사 활용
        l = 10000000L * 10000000L;
        System.out.println(l);
    }
}
