//import java.util.Scanner;
class Work extends Thread
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
        Work w1=new Work("Hello");
        // Thread th1=new Thread();
        // Work w2=new Work();
        // Thread th2=new Thread(w2);

        w1.start();
        // th2.start();
        System.out.println(w1.getName());
        
        //Scanner input=new Scanner(System.in);
        
        //input.close();
    }
}