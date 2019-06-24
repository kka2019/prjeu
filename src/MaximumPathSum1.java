import java.util.ArrayList;
import java.util.Scanner;

public class MaximumPathSum1 {

    public static ArrayList<Integer> sums = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        // test cases loop
        while (t--> 0) {
            // main solution
            int n = scanner.nextInt();
            int[][] triangle = new int[n][n];

            for(int i=0; i<triangle.length; i++){
                for(int j=0; j<=i; j++){
                    triangle[i][j] = scanner.nextInt();
                }
            }

            printTriangle(triangle);
        }

    }

    public static void printTriangle(int[][] tri){
     for(int i=0; i<tri.length; i++){
         for(int j=0; j<=i; j++){
             System.out.print(tri[i][j] + " ");
         }
         System.out.println();
     }
    }
}