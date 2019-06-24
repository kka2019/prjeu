import java.math.BigInteger;
import java.util.Scanner;

public class LatticePaths {

    public static BigInteger[] memo = new BigInteger[1000];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            BigInteger answer;
            answer = factorial(BigInteger.valueOf(n + m))
                    .divide(factorial(BigInteger.valueOf(n)))
                    .divide(factorial(BigInteger.valueOf(m)))
                    .mod(BigInteger.valueOf(1000000000 + 7));
            System.out.println(answer);
        }
    }

    public static BigInteger factorial(BigInteger n){
        if(memo[n.intValue()] != null){
            return memo[n.intValue()];
        }
        if(n.intValue()==0 || n.intValue()==1){
            return BigInteger.ONE;
        }
        memo[n.intValue()] = n.multiply(factorial(BigInteger.valueOf(n.intValue() - 1)));
        return memo[n.intValue()];
    }
}
