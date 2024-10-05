public class sumDigit {
    public sumDigit() {
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }

    public static int sumOfDigits(int number) {
        number = Math.abs(number);

        int sum;
        for(sum = 0; number > 0; number /= 10) {
            sum += number % 10;
        }

        return sum;
    }
}
