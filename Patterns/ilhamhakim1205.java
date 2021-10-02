import java.util.Scanner;
/**
 * MUHAMMAD ILHAM EL HAKIM | POLINEMA
 * @author MODERN14
 */
public class ilhamhakim1205 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1+i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}