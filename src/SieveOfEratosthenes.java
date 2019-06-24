import java.util.Scanner;
import java.util.Vector;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int n = /*scanner.nextInt()*/200000;
        boolean[] prime = new boolean[n+1];
        for(int i=0; i<prime.length; i++){
            prime[i] = true;
        }

        for(int p=2; p*p <= n; p++){
            if(prime[p] == true){
                for(int i=p*p; i<=n; i+=p){
                    prime[i] = false;
                }
            }
        }

        Vector<Integer> nthPrime = new Vector<>();
        for(int i=2; i<prime.length; i++){
            if(prime[i] == true)
                nthPrime.add(i);
        }
        System.out.print(nthPrime.get(scanner.nextInt()-1));
    }
}
