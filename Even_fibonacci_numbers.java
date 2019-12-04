public class Main {

    static long sumEven = 0;

    public static void main(String[] args) {
        getSumOfFibonacci(1, 1);
        System.out.println("Even sum >"+sumEven);
    }

    private static long getSumOfFibonacci(long prev, long current) {
        long temp = current;
        current = prev + current;
        prev = temp;
        if(current <= 4000000) {
            if((current & 1) == 0) {
                sumEven += current;
            }
            getSumOfFibonacci(prev, current);
        }
        return current;
    }
}
