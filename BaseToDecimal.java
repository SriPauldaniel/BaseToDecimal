import java.util.Scanner;
public class BaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(baseToDecimal(n, m));
        sc.close();
    }

    static int baseToDecimal(int n,int m) {
        int decimal = 0;
        int power = 0;
        while(n>0) {
            decimal += (n%10) * Math.pow(m,power);
            n /= 10;
            power++;
        }
        return decimal;
    }
}