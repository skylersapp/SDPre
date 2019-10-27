public class CreatingVariablesSD {
  public static void main( String[] args ) {
    int x, y, age, year;
    double seconds, e, checking, pi;
    String firstName, lastName, title, SD, CO;

    x = 10;
    y = 400;
    age = 32;
    year = 2029;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    pi = 3.131592653;

    firstName = "Skyler";
    lastName = "Sapp";
    title = "Mr.";
    SD = "Skill Distillery";
    CO = "7400 E Orchard Road Unit 1450N";

    System.out.println("The variable x contains " + x );
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + " " + lastName );

    System.out.println("\n\nStudy Drill Portion:");
    System.out.println("\n\nA decade from now will be the year " + year );
    System.out.println("The first ten digits of the infinite number pi are: " + pi );
    System.out.println("I'm so excited to learn Java at " + SD + " located at " + CO + " in Greenwood Village, CO!" );


  }
}
