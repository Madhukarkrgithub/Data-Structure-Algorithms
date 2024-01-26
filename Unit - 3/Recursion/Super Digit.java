import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String N = sc.next();
            System.out.println(calculateSuperDigit(N));
        }
    }
    public static int calculateSuperDigit(String num) {
        if (num.length() == 1) {
            return Integer.parseInt(num);
        }
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        return calculateSuperDigit(Long.toString(sum));
    }
}
