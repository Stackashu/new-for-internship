import java.util.Scanner;

public class fibonaaciLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scan.nextInt();
        int a = 0;
        int b = 1;

        int count = 2;


        while (count<=n) {
    
         int s = a + b;
         a = b;
         b=s;
            count++;
        }
            System.out.println(b);
        
        
    }
}
