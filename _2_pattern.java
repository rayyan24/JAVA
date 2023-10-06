import java.util.Scanner;
public class _2_pattern {

  static void print_rectangle(int rows, int column) {
    int a, b;
    for (a = 1; a <= rows; a++) {
      for (b = 1; b <= column; b++) {
        if (a == 1 || a == rows || b == 1 || b == column) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Number of rows");
    int row=input.nextInt();
    print_rectangle(row, row);
    input.close();
  }
}
