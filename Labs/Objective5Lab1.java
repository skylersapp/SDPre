import java.util.Scanner;

public class Objective5Lab1 {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    int month = 6;


    switch (month){
      case 1:
        System.out.println("January");
        break;

      case 6:
        System.out.println("June");
        break;
      
      default:
        System.out.println("That is not a valid month");
        break;
    }
  }
}
