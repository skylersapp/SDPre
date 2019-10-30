public class ThereAndBackAgain{
  public static void main(String[] args){
    System.out.println("Here.");
    erebor();
    System.out.println("Back first time.");
    erebor();
    System.out.println("Back second time.");
  }

  public static void erebor(){
    System.out.println("There.");
  }
}


/* When the parentheses were removed, it would not compile. Before
removing the second "erebor" I expected doing so would call the first,
but ignore the second. I was correct. */
