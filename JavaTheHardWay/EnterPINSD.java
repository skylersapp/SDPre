import java.util.Scanner;

public class EnterPINSD {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String pass = "JtHW", word;

    pin = 12345;

    System.out.println("\nWELCOME TO THE BANK OF JAVA.");
    System.out.print("PLEASE ENTER YOUR PASSWORD: ");
     word = keyboard.next();

    while (!pass.equals(word)){
      System.out.println("\nINCORRECT PASSWORD. PLEASE TRY AGAIN");
      System.out.print("PLEASE ENTER YOUR PASSWORD: ");
      word = keyboard.next();
    }

    System.out.println("\n*PASSWORD ACCEPTED* ");
    System.out.print("NOW, PLEASE ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\n*PIN ACCEPTED* \nYOUR ACCOUNT BALANCE IS $425.17\n");
  }
}
