import java.util.Scanner;

public class charCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your value");
        int W = scan.next().trim().charAt(0);
         
        if( W >= 'a' && W <='z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }
    }
}
