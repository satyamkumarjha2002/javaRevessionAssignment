class Rectangle {
    private double width;
    private double length;

    Rectangle() {

    }

    Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else if (length < 0) {
            this.length = length;
        } else {
            this.length = length;
            this.width = width;
        }

    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return this.length * this.width;
    }
}

class Cuboid extends Rectangle {
    private double height;

    public Cuboid() {
    }

    public Cuboid(double height, double length, double width) {
        super(width, length);
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    double getHeight() {
        return this.height;
    }

    double getVolume() {
        return super.getArea() * height;
    }

}

public class SwimingCompanyApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
