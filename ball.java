import java.applet.*;
import java.awt.*;
class ball extends Applet implements Runnable {

  public static void main(String[] args) {
    ball b1 = new ball();
    Thread t1 = new Thread(b1);
    t1.start();
  }
  Thread t;
  int x = 0;
  int y = 0;
  public void start() {
    t = new Thread(this);
    t.start();
  }
  public void paint(Graphics g) {
    g.fillOval(x, y, 100, 100);
  }
  public void run() {
    try {
      for (;;) {
        for (;;) {
          if (y == 120) {
            break;
          } else if (x == 390) {
            x = 0;
            y = 0;
            repaint();
          } else {
            y = y + 3;
            x = x + 3;
            Thread.sleep(100);
            repaint();
          }
        }
        for (;;) {
          if (y == 0) {
            break;
          } else if (x == 390) {
            x = 0;
            y = 0;
            repaint();
          } else {
            y = y - 3;
            x = x + 3;
            Thread.sleep(100);
            repaint();
          }
        }
        run();
      }
    } catch (InterruptedException e) {}
  }
}