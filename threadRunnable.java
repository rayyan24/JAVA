//import java.util.Scanner;
class Work1 implements Runnable {

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("In Run 1");
    }
  }
}

class Work2 implements Runnable {

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("In Run 2");
    }
  }
}

public class threadRunnable {

  public static void main(String[] args) {
      Work1 w1= new Work1();
      Thread t1=new Thread(w1);
      Work2 w2= new Work2();
      Thread t2=new Thread(w2);
      t1.start();
      t2.start();

  }
}
