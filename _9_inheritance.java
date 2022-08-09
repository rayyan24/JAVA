class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }

    void show() {
        System.out.println("Length=" + length);
        System.out.println("Breadth=" + breadth);
        System.out.println("Area= " + this.getArea());
    }
}

class Cuboid extends Rectangle {
    int height;

    Cuboid() {
        length = 0;
        breadth = 0;
    }

    Cuboid(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;

    }

    int getVolume() {
        return length * breadth * height;
    }

    void show() {
        System.out.println("Length= " + length);
        System.out.println("Breadth= " + breadth);
        System.out.println("Height= " + height);
        System.out.println("Volume= " + this.getVolume());

    }
}

public class _9_inheritance {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 6);
        r1.show();
        Cuboid c1 = new Cuboid();
        Cuboid c2 = new Cuboid(5, 7, 9);
        c1.show();
        c2.show();
    }
}