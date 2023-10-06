import java.util.Scanner;
public class _6_change_string
{
    static String changeString(String s){
        int len=s.length();
        char lastchar=s.charAt(len-1);
        return lastchar + s + lastchar;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String str="";
        System.out.print("Enter a string: ");    
        str=input.nextLine();
        str=changeString(str);
        System.out.println(str);
        input.close();
    }
}