import java.math.BigInteger;
public class Big {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void printFactorials(int limit) {
        System.out.println("Number\tFactorial");
        for (int i = 0; i <= limit; i++) {
            System.out.println(i + "\t" + factorial(i));
        }
    }
    public static void main(String[] args) {
        printFactorials(30);
    }
}