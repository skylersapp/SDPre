import java.util.Scanner;

public class SafeSquareRootSD {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ans, wer = "yes";


    System.out.print("\nWell, hello there! I'd like to show you what I can do! ");
    System.out.print("Are you ready?!? >:");
    ans = keyboard.next().toLowerCase();

    while (!ans.equals(wer)){
      System.out.println("\nUm.. let's try that again, shall we? ");
      System.out.print("Are you ready? (correct answer rhymes with \"shmess\") >:");
      ans = keyboard.next().toLowerCase();
    }

    System.out.print("\nGreat! Okay.. Give me a number and I'll find it's square root. ");
    System.out.print("(NO negatives, please.) ");
    x = keyboard.nextDouble();

    while (x<0){
      System.out.println("\nI won't take the square root of a negative.");
      System.out.print("New number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " +x+ " is " +y+ "\n");
  }
}
