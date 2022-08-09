//import java.util.Scanner;
class Work implements Runnable
{
    public Work(String name)
    {
        // Used to give a name to the thread 
        super(name);
    }
    
    public void run()
    {
        // for(int i=0;i!=100;i++)
        {
            System.out.println(31);
        }
    }
}
public class ThreadConstructor
{
     public static void main(String[] args)
    {
        Work w1=new Work();
        Thread th1=new Thread("hello",w1);

    }
}