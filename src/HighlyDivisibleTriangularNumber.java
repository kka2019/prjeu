import java.util.Scanner;

public class HighlyDivisibleTriangularNumber {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // My solution (2 test cases timeout)
        /*boolean[] isPrime = new boolean[1000000+1];

        for(int i=0; i<isPrime.length; i++){
            isPrime[i] = true;
        }

        for(int p =2; p<=Math.sqrt(1000000); p++){
            if(isPrime[p]){
                for(int i=p*p; i<=1000000; i+=p){
                    isPrime[i] = false;
                }
            }
        }

        Vector<Integer> nthPrime = new Vector<>();
        for(int i=2; i<isPrime.length; i++){
            if(isPrime[i]){
                nthPrime.add(i);
            }
        }

        int t = scanner.nextInt();
        for(int a0=0; a0<t; a0++){
            int n = scanner.nextInt();
            int count = 0;
            int triNumber = 0;
            int naturalNumber = 1;
            while(count <= n){
                count = 1;
                triNumber = (naturalNumber * (naturalNumber + 1)) / 2;
                HashMap<Integer,Integer> primeCount = new HashMap<>();
                int tempTri = triNumber;
                for(int i=0; nthPrime.get(i)<=tempTri; i++){
                    while(tempTri % nthPrime.get(i) == 0){
                        if(!primeCount.containsKey(nthPrime.get(i))){
                            primeCount.put(nthPrime.get(i),1);
                        }
                        else{
                            primeCount.put(nthPrime.get(i),primeCount.get(nthPrime.get(i))+1);
                        }
                        tempTri = tempTri / nthPrime.get(i);
                    }
                }

                for(Map.Entry entry : primeCount.entrySet()){
                    count = count * ((int)entry.getValue() + 1);
                }
                naturalNumber += 1;
            }
            System.out.println(triNumber);
        }*/

        // Solution given in the Discussion
        long start = System.currentTimeMillis();
        int[] arr = new int[1001];
        int count=0, naturalNumber=0;
        for(int i=1; i<=1000; i++){
            while(count<=i){
                naturalNumber++;
                count = divisorCount((naturalNumber * (naturalNumber + 1)) / 2);
            }
            arr[i] = (naturalNumber * (naturalNumber + 1)) / 2;
        }

        int t = scanner.nextInt();
        while(t>0){
            int n = scanner.nextInt();
            System.out.println(arr[n]);
            t--;
        }
        long end = System.currentTimeMillis();
        System.out.println("Duration : " + (end - start));
    }

    public static int divisorCount(int n){
        int count=0;
        if(n == 1){
            return 1;
        }
        for(int i=1; i<Math.ceil(Math.sqrt(n)); i++){
            if(n%i == 0){
                count+=2;
            }
        }
        if(Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n))){
            count++;
        }
        return count;
    }
}
