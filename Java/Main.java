/**
 * The Main code that runs the 'Triangle' Class.
 *
 * @author: Sam Corbett
 * @version: 1.0
 * @since: 2024/11/13
 */
public final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The main method.
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        System.out.println("");

        // Test Triangle #1
        Triangle testTriangle1 = new Triangle(3, 4, 5);
        System.out.println("Test #1:");
        System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
        System.out.println(" → Is the triangle valid: "
                + testTriangle1.isValid());
        System.out.println(" → Semiperimeter: "
                + testTriangle1.semiPerimeter() + " mm");
        System.out.println(" → Area: "
                + testTriangle1.area() + " mm\00B2");
        System.out.println(" → Type: "
                + testTriangle1.getType());
        System.out.println(" → Angle 1: "
                + testTriangle1.angle(1) + " rad");
        System.out.println(" → Angle 2: "
                + testTriangle1.angle(2) + " rad");
        System.out.println(" → Angle 3: "
                + testTriangle1.angle(3) + " rad");
        System.out.println(" → Height 1: "
                + testTriangle1.height(1) + " mm");
        System.out.println(" → Height 2: "
                + testTriangle1.height(2) + " mm");
        System.out.println(" → Height 3: "
                + testTriangle1.height(3) + " mm");
        System.out.println(" → Inner circle radius: "
                + testTriangle1.innerCircleRadius() + " mm");
        System.out.println(" → Circumcircle radius: "
                + testTriangle1.circumsicleRadius() + " mm");
        System.out.println("");

        // Test Triangle #2
        Triangle testTriangle2 = new Triangle(3, 3, 3);
        System.out.println("Test #2:");
        System.out.println("Created a 3 mm by 3 mm by 3 mm triangle.");
        System.out.println(" → Is the triangle valid: "
                + testTriangle2.isValid());
        System.out.println(" → Semiperimeter: "
                + testTriangle2.semiPerimeter() + " mm");
        System.out.println(" → Area: "
                + testTriangle2.area() + " mm\00B2");
        System.out.println(" → Type: "
                + testTriangle2.getType());
        System.out.println(" → Angle 1: "
                + testTriangle2.angle(1) + " rad");
        System.out.println(" → Angle 2: "
                + testTriangle2.angle(2) + " rad");
        System.out.println(" → Angle 3: "
                + testTriangle2.angle(3) + " rad");
        System.out.println(" → Height 1: "
                + testTriangle2.height(1) + " mm");
        System.out.println(" → Height 2: "
                + testTriangle2.height(2) + " mm");
        System.out.println(" → Height 3: "
                + testTriangle2.height(3) + " mm");
        System.out.println(" → Inner circle radius: "
                + testTriangle2.innerCircleRadius() + " mm");
        System.out.println(" → Circumcircle radius: "
                + testTriangle2.circumsicleRadius() + " mm");
        System.out.println("");

        // Test Triangle #3
        Triangle testTriangle3 = new Triangle(3, 4, 4);
        System.out.println("Test #3");
        System.out.println("Created a 3 mm by 4 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: "
                + testTriangle3.isValid());
        System.out.println(" → Semiperimeter: "
                + testTriangle3.semiPerimeter() + " mm");
        System.out.println(" → Area: "
                + testTriangle3.area() + " mm\00B2");
        System.out.println(" → Type: "
                + testTriangle3.getType());
        System.out.println(" → Angle 1: "
                + testTriangle3.angle(1) + " rad");
        System.out.println(" → Angle 2: "
                + testTriangle3.angle(2) + " rad");
        System.out.println(" → Angle 3: "
                + testTriangle3.angle(3) + " rad");
        System.out.println(" → Height 1: "
                + testTriangle3.height(1) + " mm");
        System.out.println(" → Height 2: "
                + testTriangle3.height(2) + " mm");
        System.out.println(" → Height 3: "
                + testTriangle3.height(3) + " mm");
        System.out.println(" → Inner circle radius: "
                + testTriangle3.innerCircleRadius() + " mm");
        System.out.println(" → Circumcircle radius: "
                + testTriangle3.circumsicleRadius() + " mm");
        System.out.println("");

        // Test Triangle #4
        Triangle testTriangle4 = new Triangle(2, 3, 4);
        System.out.println("Test #4");
        System.out.println("Created a 2 mm by 3 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: "
                + testTriangle4.isValid());
        System.out.println(" → Semiperimeter: "
                + testTriangle4.semiPerimeter() + " mm");
        System.out.println(" → Area: "
                + testTriangle4.area() + " mm\00B2");
        System.out.println(" → Type: "
                + testTriangle4.getType());
        System.out.println(" → Angle 1: "
                + testTriangle4.angle(1) + " rad");
        System.out.println(" → Angle 2: "
                + testTriangle4.angle(2) + " rad");
        System.out.println(" → Angle 3: "
                + testTriangle4.angle(3) + " rad");
        System.out.println(" → Height 1: "
                + testTriangle4.height(1) + " mm");
        System.out.println(" → Height 2: "
                + testTriangle4.height(2) + " mm");
        System.out.println(" → Height 3: "
                + testTriangle4.height(3) + " mm");
        System.out.println(" → Inner circle radius: "
                + testTriangle4.innerCircleRadius() + " mm");
        System.out.println(" → Circumcircle radius: "
                + testTriangle4.circumsicleRadius() + " mm");
        System.out.println("");

        // Test Triangle #5
        Triangle testTriangle5 = new Triangle(23, 4, 6);
        System.out.println("Test #5");
        System.out.println("Created a 23 mm by 3 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: "
                + testTriangle5.isValid());
        System.out.println(" → Semiperimeter: "
                + testTriangle5.semiPerimeter() + " mm");
        System.out.println(" → Area: "
                + testTriangle5.area() + " mm\00B2");
        System.out.println(" → Type: "
                + testTriangle5.getType());
        System.out.println(" → Angle 1: "
                + testTriangle5.angle(1) + " rad");
        System.out.println(" → Angle 2: "
                + testTriangle5.angle(2) + " rad");
        System.out.println(" → Angle 3: "
                + testTriangle5.angle(3) + " rad");
        System.out.println(" → Height 1: "
                + testTriangle5.height(1) + " mm");
        System.out.println(" → Height 2: "
                + testTriangle5.height(2) + " mm");
        System.out.println(" → Height 3: "
                + testTriangle5.height(3) + " mm");
        System.out.println(" → Inner circle radius: "
                + testTriangle5.innerCircleRadius() + " mm");
        System.out.println(" → Circumcircle radius: "
                + testTriangle5.circumsicleRadius() + " mm");
        System.out.println("");

        System.out.println("\nDone.");
    }
}
