import java.util.Scanner;

public class Objective4Lab4 {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);

    int var;

    System.out.println("\nPlease enter a number: ");
    var = keyboard.nextInt();

    if (var%2==0){
      System.out.println("The number is even\n");
    }
    else{
      System.out.println("The number is odd\n");
    }
  }
}
