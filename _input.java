import java.util.Scanner;
public class _input {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int a;
        float b;
        String c;
        System.out.println("Enter a Integer");
        a=input.nextInt();
        System.out.println("Enter a Float");
        b=input.nextFloat();
        System.out.println("Enter a String");
        c=input.next();
        System.out.println("Integer = "+a);
        System.out.println("Float = " +b);
        System.out.println("String = " +b);
        
    }
}
