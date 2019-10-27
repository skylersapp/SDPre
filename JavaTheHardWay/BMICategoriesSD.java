import java.util.Scanner;

public class BMICategoriesSD {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    double bmi, in, lb;

    System.out.print("Enter your height in inches: ");
    in = keyboard.nextDouble();

    System.out.print("Enter your weight in pounds: ");
    lb = keyboard.nextDouble();

    bmi = ( (lb /2.205) / ( (in / 39.37)*(in / 39.37) ));

    System.out.println("\n\nYour BMI is: \n" + bmi);

    System.out.println("\n\nBMI Category: ");
    if (bmi<15.0) {
      System.out.println("very severely underweight\n\n");
    }
    else if (bmi<=16.0) {
      System.out.println("severely underweight\n\n");
    }
    else if (bmi<18.5) {
      System.out.println("underweight\n\n");
    }
/* HWen removed, the "normal weight" printout comes out with the
expected printout. added "else" back in for proper operation*/

    else if (bmi<25.0) {
      System.out.println("normal weight\n\n");
    }
    else if (bmi<30.0){
      System.out.println("overweight\n\n");
    }
    else if (bmi<35.0){
      System.out.println("moderately obese\n\n");
    }
    else if (bmi<40.0){
      System.out.println("severely obese\n\n");
    }
    else {
      System.out.println("very severely/\"morbidly\" obese\n\n");
    }
  }
}
