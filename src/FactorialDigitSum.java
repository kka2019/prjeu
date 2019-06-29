import java.math.BigInteger;
import java.util.Scanner;

public class FactorialDigitSum {

    public static BigInteger[] memo = new BigInteger[1000];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int sum = 0;
            int n = scanner.nextInt();
            String f = String.valueOf(factorial(BigInteger.valueOf(n)));
            System.out.println(f);
            for(int i=0; i<f.length(); i++){
                sum += ((int)f.charAt(i) - 48);
            }
            System.out.println(sum);
        }
    }

    public static BigInteger factorial(BigInteger n){
        if(memo[n.intValue()] != null){
            return memo[n.intValue()];
        }
        if(n.intValue()==0 || n.intValue()==1){
            return BigInteger.ONE;
        }
        memo[n.intValue()] = n.multiply(factorial(BigInteger.valueOf(n.intValue()-1)));
        return memo[n.intValue()];
    }
}
