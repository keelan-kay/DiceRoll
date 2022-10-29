import uulib.Console;

class Main {

  public static int rollTwoOf(int num) {

    int n1 = (int) ( Math.random() * 6 + 1);
    int n2 = (int) ( Math.random() * 6 + 1);

    int count = 1;
    // numbers are generated until both match the user's input
    while (num != n1 && num != n2) {
    
    n1 = (int) ( Math.random() * 6 + 1);
    n2 = (int) ( Math.random() * 6 + 1);

    // count is incremented at the end of every loop
    count = count + 1;
    }
    return count;
    }

    
  public static void main(String[] args) {
        int value = Console.getInt("Enter number (1-6): ");
        int numThrows = rollTwoOf(value);

        System.out.println("It took " + numThrows + " throws to roll a " + value + " on both dice");
  }
}