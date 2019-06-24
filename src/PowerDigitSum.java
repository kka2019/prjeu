import java.math.BigInteger;
import java.util.Scanner;

public class PowerDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            BigInteger sum = BigInteger.ZERO;
            BigInteger number = BigInteger.ONE;
            for(int i=0; i<n; i++){
                number = number.multiply(BigInteger.TWO);
            }
            while(!number.equals(BigInteger.ZERO)){
                sum = sum.add(number.mod(BigInteger.TEN));
                number = number.divide(BigInteger.TEN);
            }
            System.out.println(sum);
        }
    }
}
