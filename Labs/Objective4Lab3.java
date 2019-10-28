import java.util.Scanner;

public class Objective4Lab3 {
  public static void main( String[] args){
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("\nPlease enter a number: ");
    userNum = scanner.nextInt();

    if(userNum>0) {
      System.out.println("The number is positive\n");
    }
    else if(userNum==0){
      System.out.println("The number is neither\n");
    }
    else{
      System.out.println("The number is negative\n");
    }
  }
}
