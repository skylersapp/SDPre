import java.util.Scanner;

public class WeaselOrNotSD {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println( "Type the word \"weasel\", please.");
    word = keyboard.next();

    yep = "weasel".equals(word);
    nope =! word.equals("weasel");

    System.out.println("You typed what was requested: " +yep);
    System.out.println("You ignored polite instructions: " +nope);

    }
}

/*This still worked. I assume it's becasue the quotes
around weasel still allows for the .equal comparison to made properly.*/
