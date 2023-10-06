import java.util.Scanner;
public class _3_seasons
{
     public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int month;
        System.out.print("Enter Month: ");
        month=input.nextInt();
        if (month==12||month==1) {
            System.out.println("Winter Season");
        }
        else if (month==2||month==3) {
            System.out.println("Spring Season");
        }
        else if (month==4||month==5||month==6) {
            System.out.println("Summer Season");
        }
        else if (month==7||month==8||month==9) {
            System.out.println("Monsoon Season");
        }
        else if (month==10||month==11) {
            System.out.println("Autumn Season");
        }
        else {
            System.out.println("Enter A Valid Month");
        }
        input.close();
    }
}