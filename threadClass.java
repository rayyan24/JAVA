class Work extends Thread {
    public void run()
    {
        int i=0;
        while (i<400) {
            System.out.println("In Run Method "+ i);
            i++;
            
        }
    }
}
public class threadClass
{
     public static void main(String[] args)
    {
        Work w1=new Work();
        Work w2=new Work();
        Work w3=new Work();
        w1.start();
        w2.start();
        w3.start();
        for (int i = 0; i < 500; i++) {
            System.out.println("In Main Method "+ i);
        }
    }
}
