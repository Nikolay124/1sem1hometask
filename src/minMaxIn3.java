
public class minMaxIn3 {
    public minMaxIn3() {
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 3;
        System.out.println(getMax3(num1, num2, num3));
    }

    public static int getMax3(int num1, int num2, int num3) {
        int max = num1;
        if (max < num2 && max > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        return max;
    }
}
