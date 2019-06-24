import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger sum = new BigInteger("0");
        while(n-->0){
            sum = sum.add(scanner.nextBigInteger());
        }
        System.out.println((sum.toString()).substring(0,10));
    }
}
