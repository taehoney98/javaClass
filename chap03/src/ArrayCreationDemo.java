public class ArrayCreationDemo {
    public static void main(String[] args) {

        int[] scoresMethod1 = {100, 90, 50, 95, 85};

        int[] scoresMethod2 = new int[] {100, 90 , 50 ,95, 85};

        int[] scoresMethod3;
        scoresMethod3 = new int[] {100, 90 , 50 ,95, 85};


        System.out.println("방법 1로 생성한 배열 ");
        for ( int score : scoresMethod1){
            System.out.println(score +" ");
        }
        System.out.println();

        System.out.println("방법 2로 생성한 배열 ");
        for ( int score : scoresMethod2){
            System.out.println(score +" ");
        }
        System.out.println();

        System.out.println("방법 3로 생성한 배열 ");
        for ( int score : scoresMethod3){
            System.out.println(score +" ");
        }
        System.out.println();

    }
}

