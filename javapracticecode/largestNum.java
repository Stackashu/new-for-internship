import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = scan.nextInt();
        System.out.print("enter b : ");
        int b = scan.nextInt();
        System.out.print("enter c : ");
        int c = scan.nextInt();
          

        if( a > b && b > c ){
            System.out.println("a " + a  + " is larger number");
        }else if( a < b && b > c){
            System.out.println("b " + b  + " is largest numeber");
        }else{
            System.out.println("c " + c + " is the largest number");
        }
    }
}
