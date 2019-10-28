import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmissionSD {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    int math;

    out.println("Welcome to the UT Austin College Admissions Interface!");
    out.print("Please enter your SAT math score (200-800): ");
    math = keyboard.nextInt();

    out.print("Admittance status: " );

    if (math>=790) {
      out.print("CERTAIN ");
    }
    else {
      if (math>=390){
        out.print("UNLIKELY ");
        /*in the JTHW Study Drill, part two says to move
        lines 23 and 24 in order to make almost all inputs
        produce UNLIKELY output. Was this not supposed to say
        lines 30-32? This is how I was able to get UNLIKELY
        as my consistent output*/
      }
    else {
      if (math>=710) {
        out.print("SAFE ");
      }
      else {
        if (math>=580){
          out.print("PROBABLE ");
        }
        else {
          if (math>=500) {
            out.print("UNCERTAIN ");
          }

            else { //below 390
            out.print("DENIED ");
            }
          }
        }
      }
    }
    out.println();
  }
}
