import java.util.Scanner;

public class ForgetfulMachineSD {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What city is the capital of France?" );
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?" );
    keyboard.nextInt();

    System.out.println("Enter a number between 0.0 and 1.0." );
    keyboard.nextDouble();

    System.out.println("Is there anything else you would like to say?" );
    keyboard.next();
//The second question blows up when I enter a fractional value.
/*The third question blows up when I enter a non-numeric input.
The reason for this is because the program tries to package a floating-point
value, but alphabetical inputs are invalid as "doubles".*/

  }
}
