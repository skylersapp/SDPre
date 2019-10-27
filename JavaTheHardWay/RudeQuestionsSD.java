import java.util.Scanner;

public class RudeQuestionsSD {
  public static void main( String[] args ) {
    String name, swallow;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh?" );
    weight = keyboard.nextDouble();

    System.out.println(weight+ "! Better keep that quiet!!");
    System.out.print("What's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Finally, " + name + ", what is the airspeed velocity of an unladen swallow?");
    swallow = keyboard.next();

    System.out.println(swallow+ ", huh? It's okay, I'm not very smart either.");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    /* My guess for why it doesn't blow up with an integer value when
    a double is expected is because it likely converts the integer value
    into a fractional value when it packages it. i.e.: 2 -> 2.0 */

    /* My guess for why a numeric value in the String input, is because the
    String allows for any alpha-numeric input. It simfply recognizes a String
    of input and accepts it, regardless of what it is. */

    /* The only way I found to blow up the program was to enter a double or
    something alphabetical for the integer value (age), or something
    alphabetical for the floating-point values (weight, income). This
    is because the expected inputs for both of these has to be numeric. the
    program cannot package letters into a numeric-only output. */




  }
}
