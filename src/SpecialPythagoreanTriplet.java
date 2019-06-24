import java.util.Scanner;

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max=-1;
        for(int a=1; a<=n/3; a++){
            int b = (n*n - 2*a*n) / (2*n - 2*a);
            int c = n-a-b;
            if((c*c == (a*a + b*b)) && ((a*b*c) > max)){
                max = a*b*c;
            }
        }
        if(max == 0)
            System.out.println(-1);
        else
            System.out.println(max);
    }
}
