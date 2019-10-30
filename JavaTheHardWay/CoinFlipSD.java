import java.util.Scanner;

public class CoinFlipSD{
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;
    again = "y";
    gotHeads = Math.random()<0.5;

    while(!again.equals("n")){
      if (gotHeads)
        coin = "HEADS";
      else
        coin = "TAILS";

      System.out.println("You flip a coin and it's " +coin);
      if (gotHeads){
        streak++;
        System.out.println("Thats " +streak+ " in a row...");
        System.out.print("Would you like to flip again (y/n)?");
        again = keyboard.next().toLowerCase();
      }
      else{
        System.out.println("You lose everything!");
        System.out.println("You should have quit while you were aHEAD...");
        streak = 0;
        again = "n";
      }
    }
    System.out.println("Final score: " +streak);
  }
}

/* I know I'm overlooking something simple, but I can't seem to figure
out why once it selects heads and I type "y", it selects ONLY heads.
the only time it selects tails is the very first selection. */
