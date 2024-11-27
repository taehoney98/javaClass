public class CtrlFlow {
    public static void main(String[] args) {
        int n =1 , s =0;

        //무한 루프에서 100까지의 숫자를 합산하고 루프 탈출
        while (true){
            s+=n;
            if (n == 100){
                break; // n이 100에 도달하면 루프를 빠져나감
            }
            n++;

        }
        System.out.println("1부터 100까지의 합: "+s);

        // 1부터 100까지의 숫자 중 5와 7의 배수를 출력
        for (int i =1 ; i <= 100; i ++){
            //  5 또는 7의 배수가 아닌경우 다음 반복으로 넘어감
            if (!(i % 5 ==0 || i % 7 ==0)){
                continue; //다음 반복으로 진행
            }
            // 5또는 7의 배수 출력
            System.out.println(i+"는 5 또는 7의 배수 입니다. ");
        }
    }
}
