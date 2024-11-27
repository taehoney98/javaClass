public class ScoreWithArray {
    public static void main(String[] args) {
        //점수를 저장할 배열 초기화
        int[] scores = {100,90,50,95,85};

        // 점수의 합을 저장할 변수 초기화
        int sum =0;

        // 배열을 사용하여 점수 합산
        for (int score : scores) {
            sum += score;
        }


        // 평균을 계산 ( 형변환을 명시적으로 수행)
        double average = (double) sum / scores.length;

        // 평균점수를 수행

        System.out.println("평균 점수: "+ average);
    }
}
