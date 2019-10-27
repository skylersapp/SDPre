public class EscapeSequencesCommentsSD {
  public static void main( String[] args ) {
    //This exercise demonstrates escape swquences &comments (like these)!
    System.out.print( "Learn\t\tJava\n\tthe\nHard\t\tWay\n\n" );
    //I added the extra tab before "Java" and "Way" in order to make the output match the example. Otherwise, "the" was not in the right place.
    System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
    //System.out.frimp( "Learn Java the Hard Way" );
    System.out.print( "Hello\n" ); //This line prints Hello.
    System.out.print( "Jello\by\n" ); //This line prints Jelly.
    /* The quick brown fox jumped over a lazy dog.
      Quick wafting zephyrs vex bold Jim. */
      System.out /* testing */ .println( "Hard to believe, eh?" );
      System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
      System.out.println( "\\ // -=- \\ //" );
      System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // it takes 2 to make 1
      System.out.print( "I hope you understand \"escape sequences\" now. \n" );
      // and comments. :)

  }
}
//The Block Comment in line 13 did not work.
//I also corrected the first two print lines, as well as the last one to just "print"
//I did not notice the mistake until after it was uploaded to Github. 
