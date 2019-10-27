import java.util.Scanner;

public class BMICalculatorSD {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double in, ft, ftc, lb, bmi, m, kg;

    System.out.print("Your height (feet only): ");
    ft = keyboard.nextDouble();

    System.out.print("Your height (inches only): ");
    in = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    lb = keyboard.nextDouble();

    ftc = (ft * 12);
    m = ((in + ftc) / 39.37);
    kg = (lb / 2.205);
    bmi = kg / (m * m);

    System.out.println("Your BMI is " + bmi);

  }
}
