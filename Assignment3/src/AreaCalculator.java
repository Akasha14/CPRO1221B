public class AreaCalculator {
    public static void main(String[] args) {

        // Starting Menu.
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Area Calculator");

        while (true) {
            // Shape variable for shape chosen by the switch statement.
            Shape shape = null;

            System.out.println();
            String shapeUserChoice = Console.getString("Calculate area of a circle, square, or rectangle? (c/s/r): ");

            switch (shapeUserChoice.toLowerCase()) {
                case "c":
                    System.out.println("CIRCLE:");
                    double userRadius = Console.getDouble("Enter radius: ");
                    // Use user input to create a circle shape.
                    shape = new Circle(userRadius);
                    break;
                case "s":
                    System.out.println("SQUARE:");
                    double userSquareWidth = Console.getDouble("Enter width: ");
                    // Use user input to create a square shape.
                    shape = new Square(userSquareWidth);
                    break;
                case "r":
                    System.out.println("RECTANGLE:");
                    double userRectWidth = Console.getDouble("Enter width: ");
                    double userRectHeight = Console.getDouble("Enter height: ");
                    // Use user input to create a rectangle shape.
                    shape = new Rectangle(userRectWidth, userRectHeight);
                    break;
                default:
                    System.out.println("Invalid shape type");
                    break;
            }

            System.out.println(shape);

            // Continue?
            String continueChoice = Console.getContinue("Do you want to continue? (y/n): ");
            if (continueChoice.equalsIgnoreCase("n")) {
                System.out.println("Exiting.");
                break;
            }
        }
    }
}

// Abstract class, all others inherit.
abstract class Shape {
    // Abstract method to get area used by subclasses.
    public abstract double getArea();

    // Override toString method.
    @Override
    public String toString() {
        return "Area: " + getArea();
    }
}

// Circle class, find area based on radius.
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the Circle.
    public Circle(double radius) {
        setRadius(radius);
    }

    // Getter for the radius.
    public double getRadius() {
        return radius;
    }

    // Setter for the radius.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override abstract method to calculate area of a circle.
    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}

// Square class, find area based on width.
class Square extends Shape {
    private double width;

    // Constructor to initialize the Square.
    public Square(double width) {
        setWidth(width);
    }

    // Getter for the width.
    public double getWidth() {
        return width;
    }

    // Setter for the width.
    public void setWidth(double width) {
        this.width = width;
    }

    // Override abstract method to calculate area of a square.
    @Override
    public double getArea() {
        return Math.pow(getWidth(), 2);
    }
}

// Rectangle class, subclass of Square, find the area based on width and height.
class Rectangle extends Square {
    private double height;

    // Constructor to initialize the rectangle.
    public Rectangle(double width, double height) {
        super(width); // Use constructor of the square class to set the width.
        setHeight(height);
    }

    // Getter for the height.
    public double getHeight() {
        return height;
    }

    // Setter for the height.
    public void setHeight(double height) {
        this.height = height;
    }

    // Override the abstract method to calculate the area of the rectangle.
    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }
}
