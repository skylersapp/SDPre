import java.util.Scanner;

public class Objective3Lab5 {
  public static void main( String[] args){
    Scanner input = new Scanner(System.in);

    double first, second, result;

    System.out.print("Please enter a number: ");
    first = input.nextDouble();

    System.out.print("Please enter another number: ");
    second = input.nextDouble();

    result = first + second;

    System.out.println("The sum of " +first+ " + "
    +second+ " = " +result);

    input.close();
    }
}
