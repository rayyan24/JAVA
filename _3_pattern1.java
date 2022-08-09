//import java.util.Scanner;
public class _3_pattern1
{
     public static void main(String[] args)
    {
        //Scanner input=new Scanner(System.in);
        int n=5;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //input.close();
    }
}