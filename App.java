import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
       System.out.println(maiorNumero(10, 34, 876));
 }
 public static int maiorNumero(int a, int b, int c) {
    if (a >= b && a >= c) return a;
    if (b >= a && b >= c) return b;
    return c;
   }
}