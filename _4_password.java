import java.util.Random;

public class _4_password {

  public static void main(String[] args) {
    Random r1 = new Random();
    for (int i = 1; i <= 4; i++) {
      char alpha = (char) r1.nextInt(97, 123);
      int num = r1.nextInt(0, 9);
      System.out.print(alpha);
      System.out.print(num);
    }
  }
}
