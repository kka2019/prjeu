import java.util.Scanner;

public class SummationOfPrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean[] prime = new boolean[1000001];
        for(int i=0; i<prime.length; i++){
            prime[i] = true;
        }

        for(int p=2; p<=Math.sqrt(1000000); p++){
            if(prime[p] == true){
                for(int i=p*p; i<=1000000; i+=p){
                    prime[i] = false;
                }
            }
        }

        long[] sum = new long[1000001];
        sum[0] = 0;
        sum[1] = 0;
        for(int i=2; i<sum.length; i++){
            if(prime[i] == true){
                sum[i] = sum[i-1] + i;
            }
            else
                sum[i] = sum[i-1];
        }
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(sum[n]);
        }
    }
}
