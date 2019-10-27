import java.util.Scanner;

public class ComparingNumbersSD {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print("Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print("Second: ");
    second = keyboard.nextDouble();

    if (first<second)
      System.out.println(first+ " is LESS THAN " +second);

    if (first<=second)
      System.out.println(first+ " is LESS THAN / EQUAL TO " +second);

    if (first==second)
      System.out.println(first+ " is EQUAL TO " +second);

    if (first>=second)
      System.out.println(first+ " is GREATER THAN / EQUAL TO " +second);

    if (first>second)
      System.out.println(first+ " is GREATER THAN " +second);

    if (first!=second){
      System.out.println(first+ " is NOT EQUAL TO " +second);
      System.out.println("Hey");
    }

  }
}
 /* I think the "hey" will run regardless, because it is always a
 *true* statement; it's always being told to print.*/

 /* Ran the program and "hey" printed each time. With the curly braces
 in place, it only prints out when the first is not equal to second,
 since it is part of that same overall if statement. */
 
