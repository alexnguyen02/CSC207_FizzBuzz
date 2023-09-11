public class Reduce {
    public static void main(String[] args) {
        int stepCount = 0;
        int i = 100;
        while(i > 0){
            if (i % 2 == 0){
                i = i / 2;
                stepCount++;
            } else {
                i = i - 1;
                stepCount++;
            }

        }
        System.out.println(stepCount);
    }
}
