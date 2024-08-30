import java.util.Scanner;

 
public class areaOfSquare{


    public void getArea( int side){
        System.out.println("The area of Square is :" + side*side);
      }
    public static void main(String[] args){
int side;
Scanner scan = new Scanner(System.in);
System.out.println("Enter side of the Squares");
side = scan.nextInt();
areaOfSquare ar = new areaOfSquare();
ar.getArea(side);

    }
}