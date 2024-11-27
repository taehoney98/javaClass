public class ForEx {
    public static void main(String[] args) {
        int i , sum= 0;

        // 5번 반복하는 for 문
        for( i =0;i<5;i++){
            sum +=i; //sum 에 I를 더해서 누적 합계를 구함
            System.out.println("for 루프" + (i+1) + "번째 반복 실행중입니다.");
        }

        // 루프가 종료 된 후 반복회수와 누적 합계 출력
        System.out.println("for 루프 종료 후 반복횟수: "+i);
        System.out.println("누적합계:" + sum);

        // 확장된 for문의 사용 예시
        int[]numbers ={1,2,3,4,5};
        for (int num: numbers){
            System.out.println("확장 for 루프에서 처리하는 값: " + num);
        }
    }
}
