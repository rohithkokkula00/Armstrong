public class Armstrong {
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, remainder;
        int digits = String.valueOf(num).length();

        while (temp != 0) {
            remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }

        return sum == num;
    }

    public static void printArmstrongNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int startRange = 1, endRange = 1000;
        printArmstrongNumbers(startRange, endRange);
    }
}
