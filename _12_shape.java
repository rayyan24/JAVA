interface Shape {
  String color = "RED";
  void draw();
}

abstract class Circle implements Shape {

  int radius;
}

class Rectangle implements Shape {

  int length, breadth;

  public void draw() {
    System.out.println("Drawn a Rectangle");
  }
}

class SolidCircle extends Circle {

  public void draw() {
    System.out.println("Drawn a Circle");
  }
}

public class _12_shape {

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();
    SolidCircle c1 = new SolidCircle();
    SolidCircle c2 = new SolidCircle();
    r1.draw();
    r2.draw();
    c1.draw();
    c2.draw();
  }
}
