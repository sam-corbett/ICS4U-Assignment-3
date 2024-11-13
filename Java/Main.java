import java.text.DecimalFormat;

/**
 * The Main code that runs the 'Triangle' Class.
 *
 * @author: Sam Corbett
 * @version: 1.0
 * @since: 2024/11/13
 */
public final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException if this ever is called.
     *
     * @throws IllegalStateException if instantiation is attempted.
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The main method.
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");

        System.out.println("");

        // Test Triangle #1
        Triangle testTriangle1 = new Triangle(3, 4, 5);
        System.out.println("Test #1:");
        System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
        System.out.println(" -> Is the triangle valid: "
                + testTriangle1.isValid());
        System.out.println(" -> Semiperimeter: "
                + df.format(testTriangle1.semiPerimeter()) + " mm");
        System.out.println(" -> Area: "
                + df.format(testTriangle1.area()) + " mm²");
        System.out.println(" -> Type: "
                + testTriangle1.getType());
        System.out.println(" -> Angle 1: "
                + df.format(testTriangle1.angle(1)) + " rad");
        System.out.println(" -> Angle 2: "
                + df.format(testTriangle1.angle(2)) + " rad");
        System.out.println(" -> Angle 3: "
                + df.format(testTriangle1.angle(3)) + " rad");
        System.out.println(" -> Height 1: "
                + df.format(testTriangle1.height(1)) + " mm");
        System.out.println(" -> Height 2: "
                + df.format(testTriangle1.height(2)) + " mm");
        System.out.println(" -> Height 3: "
                + df.format(testTriangle1.height(3)) + " mm");
        System.out.println(" -> Inner circle radius: "
                + df.format(testTriangle1.innerCircleRadius()) + " mm");
        System.out.println(" -> Circumcircle radius: "
                + df.format(testTriangle1.circumsicleRadius()) + " mm");
        System.out.println("");

        // Test Triangle #2
        Triangle testTriangle2 = new Triangle(3, 3, 3);
        System.out.println("Test #2:");
        System.out.println("Created a 3 mm by 3 mm by 3 mm triangle.");
        System.out.println(" -> Is the triangle valid: "
                + testTriangle1.isValid());
        System.out.println(" -> Semiperimeter: "
                + df.format(testTriangle1.semiPerimeter()) + " mm");
        System.out.println(" -> Area: "
                + df.format(testTriangle1.area()) + " mm²");
        System.out.println(" -> Type: "
                + testTriangle1.getType());
        System.out.println(" -> Angle 1: "
                + df.format(testTriangle1.angle(1)) + " rad");
        System.out.println(" -> Angle 2: "
                + df.format(testTriangle1.angle(2)) + " rad");
        System.out.println(" -> Angle 3: "
                + df.format(testTriangle1.angle(3)) + " rad");
        System.out.println(" -> Height 1: "
                + df.format(testTriangle1.height(1)) + " mm");
        System.out.println(" -> Height 2: "
                + df.format(testTriangle1.height(2)) + " mm");
        System.out.println(" -> Height 3: "
                + df.format(testTriangle1.height(3)) + " mm");
        System.out.println(" -> Inner circle radius: "
                + df.format(testTriangle1.innerCircleRadius()) + " mm");
        System.out.println(" -> Circumcircle radius: "
                + df.format(testTriangle1.circumsicleRadius()) + " mm");
        System.out.println("");

        // Test Triangle #3
        Triangle testTriangle3 = new Triangle(3, 4, 4);
        System.out.println("Test #3:");
        System.out.println("Created a 3 mm by 4 mm by 4 mm triangle.");
        System.out.println(" -> Is the triangle valid: "
                + testTriangle1.isValid());
        System.out.println(" -> Semiperimeter: "
                + df.format(testTriangle1.semiPerimeter()) + " mm");
        System.out.println(" -> Area: "
                + df.format(testTriangle1.area()) + " mm²");
        System.out.println(" -> Type: "
                + testTriangle1.getType());
        System.out.println(" -> Angle 1: "
                + df.format(testTriangle1.angle(1)) + " rad");
        System.out.println(" -> Angle 2: "
                + df.format(testTriangle1.angle(2)) + " rad");
        System.out.println(" -> Angle 3: "
                + df.format(testTriangle1.angle(3)) + " rad");
        System.out.println(" -> Height 1: "
                + df.format(testTriangle1.height(1)) + " mm");
        System.out.println(" -> Height 2: "
                + df.format(testTriangle1.height(2)) + " mm");
        System.out.println(" -> Height 3: "
                + df.format(testTriangle1.height(3)) + " mm");
        System.out.println(" -> Inner circle radius: "
                + df.format(testTriangle1.innerCircleRadius()) + " mm");
        System.out.println(" -> Circumcircle radius: "
                + df.format(testTriangle1.circumsicleRadius()) + " mm");
        System.out.println("");

        // Test Triangle #4
        Triangle testTriangle4 = new Triangle(2, 3, 4);
        System.out.println("Test #4:");
        System.out.println("Created a 2 mm by 3 mm by 4 mm triangle.");
        System.out.println(" -> Is the triangle valid: "
                + testTriangle1.isValid());
        System.out.println(" -> Semiperimeter: "
                + df.format(testTriangle1.semiPerimeter()) + " mm");
        System.out.println(" -> Area: "
                + df.format(testTriangle1.area()) + " mm²");
        System.out.println(" -> Type: "
                + testTriangle1.getType());
        System.out.println(" -> Angle 1: "
                + df.format(testTriangle1.angle(1)) + " rad");
        System.out.println(" -> Angle 2: "
                + df.format(testTriangle1.angle(2)) + " rad");
        System.out.println(" -> Angle 3: "
                + df.format(testTriangle1.angle(3)) + " rad");
        System.out.println(" -> Height 1: "
                + df.format(testTriangle1.height(1)) + " mm");
        System.out.println(" -> Height 2: "
                + df.format(testTriangle1.height(2)) + " mm");
        System.out.println(" -> Height 3: "
                + df.format(testTriangle1.height(3)) + " mm");
        System.out.println(" -> Inner circle radius: "
                + df.format(testTriangle1.innerCircleRadius()) + " mm");
        System.out.println(" -> Circumcircle radius: "
                + df.format(testTriangle1.circumsicleRadius()) + " mm");
        System.out.println("");

        // Test Triangle #5
        Triangle testTriangle5 = new Triangle(23, 4, 6);
        System.out.println("Test #5:");
        System.out.println("Created a 23 mm by 3 mm by 4 mm triangle.");
        System.out.println(" -> Is the triangle valid: "
                + testTriangle1.isValid());
        System.out.println(" -> Semiperimeter: "
                + df.format(testTriangle1.semiPerimeter()) + " mm");
        System.out.println(" -> Area: "
                + df.format(testTriangle1.area()) + " mm²");
        System.out.println(" -> Type: "
                + testTriangle1.getType());
        System.out.println(" -> Angle 1: "
                + df.format(testTriangle1.angle(1)) + " rad");
        System.out.println(" -> Angle 2: "
                + df.format(testTriangle1.angle(2)) + " rad");
        System.out.println(" -> Angle 3: "
                + df.format(testTriangle1.angle(3)) + " rad");
        System.out.println(" -> Height 1: "
                + df.format(testTriangle1.height(1)) + " mm");
        System.out.println(" -> Height 2: "
                + df.format(testTriangle1.height(2)) + " mm");
        System.out.println(" -> Height 3: "
                + df.format(testTriangle1.height(3)) + " mm");
        System.out.println(" -> Inner circle radius: "
                + df.format(testTriangle1.innerCircleRadius()) + " mm");
        System.out.println(" -> Circumcircle radius: "
                + df.format(testTriangle1.circumsicleRadius()) + " mm");
        System.out.println("");

        System.out.println("\nDone.");
    }
}
