public class MathOperationsSD {
  public static void main( String[] args ) {
    int a, b, c, d, e, f, g;
    double x, y, z;
    String one, two, both;

    a = 10;
    b = 27;
    System.out.println("a is " + a + " , b is " + b);

    c = a + b;
    System.out.println("a+b is " + c);
    d = a - b;
    System.out.println("a-b is " + d);
    e = a+b*3;
    System.out.println("a+b*3 is " + e);
    f = b/2;
    System.out.println("b/2 is " + f );
    g = b % 10;
    System.out.println("b%10 is " + g);

    x = 1.1;
    System.out.println("\nx is " + x);
    y = x*x;
    System.out.println("x*x is" + y);
    z = b/2;
    System.out.println("b/2 is " + z);
    System.out.println();

    one = "dog";
    two = "house";
    both = one + two;
    System.out.println( both );

    System.out.println("\n\n**** | Study Drill Section | ****");
//I know the below is nonsense, I was just having fun with it. :)
    int bird, plane, superman, bullet;
    double lions, tigers, bears, ohmy, lois;

    bird = 13;
    plane = 7;
    superman = 2;
    bullet = bird + plane - superman;

    lions = 1.3;
    tigers = 7.2;
    bears = 2.1;
    ohmy = lions * tigers / bears;
    lois =  bird % 2;

    System.out.println("\nbird is " + bird + " , plane is " + plane + " , superman is " + superman);
    System.out.println("bird + plane - superman is " + bullet);
    System.out.println("\nlions is " + lions + " , tigers is " + tigers + ", bears is " + bears);
    System.out.println("lions * tigers / bears is " + ohmy);
    System.out.println("\nbird % 2 is " + lois);



  }
}
