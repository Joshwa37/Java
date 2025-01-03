import java.util.Scanner;
public class Printstar {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        while (i<=n) {
            System.out.println("*");
            i++;
        }

    }
}
