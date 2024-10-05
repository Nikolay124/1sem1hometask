
public class minMaxIn2 {
    public minMaxIn2() {
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println(getMax(num1, num2));
    }

    public static int getMax(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }
}
