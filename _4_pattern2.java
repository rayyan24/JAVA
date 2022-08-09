import java.util.Scanner;
public class _4_pattern2
{
     public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=5;
        for (int row = n; row >= 1; row--) {
            for (int column = 0; column <row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}