import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            long n = scanner.nextLong();
            if(n == 0){
                System.out.println("Zero");
            } else {
                System.out.println((trillion(n / 1000000000000L) + billion((n / 1000000000)%1000) + million((n / 1000000) % 1000) + thousand((n / 1000) % 1000) + hundred(n % 1000)).trim());
            }
        }*/

        int t = 1;
        long n = 141L;
        System.out.println(n%10);
        while(t-->0) {
            if(n == 0){
                System.out.println("Zero");
            } else {
                System.out.println((trillion(n / 1000000000000L) + billion((n / 1000000000)%1000) + million((n / 1000000) % 1000) + thousand((n / 1000) % 1000) + hundred(n % 1000)).trim());
            }
            n++;
        }
    }

    public static String trillion(long number){
        if(number == 0){
            return "";
        } else {
            return hundred(number) + "Trillion ";
        }
    }

    public static String thousand(long number){
        if(number == 0){
            return "";
        }
        else {
            return hundred(number) + "Thousand ";
        }
    }

    public static String million(long number){
        if(number == 0){
            return "";
        }
        else {
            return hundred(number) + "Million ";
        }
    }

    public static String billion(long number){
        if(number == 0){
            return "";
        }
        else {
            return hundred(number) + "Billion ";
        }
    }

    public static String hundred(long number){
        if(number == 0){
            return "";
        }
        boolean canBeSingleWord = (((number/10)%10) == 0) || (((number/10)%10) == 1) || ((number%10) == 0);
        if((number/100) == 0){
            if(canBeSingleWord){
                return word((int)number);
            }
            return word((int) (((number/10) % 10) * 10)) + word((int)number%10);
        }
        if(canBeSingleWord){
            return word((int)number/100) + "Hundred " + word((int)number%100);
        }
        return word((int)number/100) + "Hundred " + word((int) (((number/10) % 10) * 10)) + word((int)number%10);
    }

    public static String word(int n){
        if(n == 0) return "";
        if(n == 1) return "One ";
        if(n == 2) return "Two ";
        if(n == 3) return "Three ";
        if(n == 4) return "Four ";
        if(n == 5) return "Five ";
        if(n == 6) return "Six ";
        if(n == 7) return "Seven ";
        if(n == 8) return "Eight ";
        if(n == 9) return "Nine ";
        if(n == 10) return "Ten ";
        if(n == 11) return "Eleven ";
        if(n == 12) return "Twelve ";
        if(n == 13) return "Thirteen ";
        if(n == 14) return "Fourteen ";
        if(n == 15) return "Fifteen ";
        if(n == 16) return "Sixteen ";
        if(n == 17) return "Seventeen ";
        if(n == 18) return "Eighteen ";
        if(n == 19) return "Nineteen ";
        if(n == 20) return "Twenty ";
        if(n == 30) return "Thirty ";
        if(n == 40) return "Forty ";
        if(n == 50) return "Fifty ";
        if(n == 60) return "Sixty ";
        if(n == 70) return "Seventy ";
        if(n == 80) return "Eighty ";
        if(n == 90) return "Ninety ";
        return "";
    }
}
