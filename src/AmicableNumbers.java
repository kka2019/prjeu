import java.util.Scanner;

public class AmicableNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int amiSum = 0;
            for(int i=2; i<n; i++){
                int sumOne = divisorSum(i);
                if((sumOne < n) && (divisorSum(sumOne) == i) && (sumOne != i)){
                    amiSum += ((sumOne + i) / 2);
                }
                if((sumOne > n) && (divisorSum(sumOne) == i) && (sumOne != i)){
                    amiSum += i;
                }
            }
            System.out.println(amiSum);
        }
    }

    public static int divisorSum(int n){
        int sum = -n;

        if(n == 1){
            return 1;
        }

        for(int i=1; i<Math.ceil(Math.sqrt(n)); i++){
            if(n%i == 0){
                sum += (i + n/i);
            }
        }

        if(Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n))){
            sum += Math.ceil(Math.sqrt(n));
        }

        return sum;
    }
}
