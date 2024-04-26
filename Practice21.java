// Base class Box
class Box {
    private double length;
    private double breadth;

    // Constructor
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Setters for length and breadth
    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // Calculate and return the area
    public double calculateArea() {
        return length * breadth;
    }
}

// Subclass Box3D extends Box
class Box3D extends Box {
    private double height;

    // Constructor
    public Box3D(double length, double breadth, double height) {
        // Call the constructor of the base class
        super(length, breadth);
        this.height = height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate and return the volume
    public double calculateVolume() {
        // Utilize the calculateArea() method from the base class
        return calculateArea() * height;
    }
}

// Main class for testing
public class Practice21 {
    public static void main(String[] args) {
        // Create an object of Box
        Box box = new Box(5.0, 3.0);

        // Set values for length and breadth
        box.setLength(6.0);
        box.setBreadth(4.0);

        // Calculate and display the area
        System.out.println("Area of the Box: " + box.calculateArea());

        // Create an object of Box3D
        Box3D box3D = new Box3D(5.0, 3.0, 2.0);

        // Set values for length, breadth, and height
        box3D.setLength(6.0);
        box3D.setBreadth(4.0);
        box3D.setHeight(3.0);

        // Calculate and display the area and volume
        System.out.println("Area of the Box3D: " + box3D.calculateArea());
        System.out.println("Volume of the Box3D: " + box3D.calculateVolume());
    }
}
