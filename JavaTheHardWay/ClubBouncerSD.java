public class ClubBouncerSD {
  public static void main( String[] args) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if (onGuestList || age>=21 || (gender.equals("F") && allure>=8) ){
      System.out.println("You are allowed to enter the club.");
    } System.println("Star Wars comes out December 22");
    else {
      System.out.println("you are not allowed to enter the club.");
    }
  }
}
/* The extra line prevented the program from compiling due to the
"else" statement not following IMMEDIATELY after "if" body. */
