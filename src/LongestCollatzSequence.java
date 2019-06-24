import java.util.Scanner;

public class LongestCollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5000001];
        long max=0;
        int answer = 1;
        arr[1] = 1;
        for(int i=2; i<=5000000; i++){
            long count=0;
            long n = i;
            while(n>1){
                if(n%2==0){
                    n = n/2;
                }
                else{
                    n = 3*n + 1;
                }
                count++;
            }
            if(count > max){
                max = count;
                answer = i;
            }else if(count == max){
                answer = i;
            }
            arr[i] = answer;
        }

        int t=scanner.nextInt();
        while(t-->0){
            int N = scanner.nextInt();
            System.out.println(arr[N]);
        }
    }
}
