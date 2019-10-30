import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection = 0;

    while (selection != 3){
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favorite foods");
      System.out.println("3: exit");
      System.out.print("\n");
      selection = scanner.nextInt();

      if (selection == 1) {
        System.out.println("Hello Human");
      }
      else if (selection == 2){
        System.out.println("Apples, Bananas, Coconuts");
      }
    }
    if (selection == 3){
      System.out.println("Goodbye");
    }scanner.close();
  }
}
