import java.util.Scanner;

public class ShallowGrandmotherSD {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    int age, happy;
    double income, cute;
    boolean allowed, allowed2;

    System.out.print("Enter your age: ");
    age = keyboard.nextInt();

    System.out.print("Enter your yearly income: ");
    income = keyboard.nextDouble();

    System.out.print("How cute are you, on a scale from 0.0 to 10.0? ");
    cute = keyboard.nextDouble();

    System.out.print("How happy do you make my grandchild, on a scale from 1 to 10? ");
    happy = keyboard.nextInt();

    allowed = (age>25 && age<40 && (income>50000 || cute>=8.5));
    allowed2 = (age>=27 && age<=37 && happy>7);

    System.out.println("Allowed to date my grandchild (grandmother 1)? "+"\n\n" +allowed+ "\n");
    System.out.println("Allowed to date my grandchild (grandmother 2)? "+"\n\n" +allowed2+ "\n");


  }
}
