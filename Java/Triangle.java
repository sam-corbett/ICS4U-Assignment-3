/**
 * The 'Triangle' Class.
 *
 * @author: Sam Corbett
 * @version: 1.0
 * @since: 2024/11/13
 */
public class Triangle {
    /**
     * The length of the first side.
     */
    private double side1;

    /**
     * The length of the second side.
     */
    private double side2;
    /**
     * The length of the third side.
     */
    private double side3;

    /**
     * Create a triangle.
     * @param side1 - The length of the first side.
     * @param side2 - The length of the second side.
     * @param side3 - The length of the third side.
     */
    public Triangle(
        final double side1Paramater,
        final double side2Paramater,
        final double side3Paramater
        ) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    /**
     * Get the length of the first side.
     * @return The length of the first side.
     */
    public double getSide1() {
        return side1;
    }

    /**
     * Get the length of the second side.
     * @return The length of the second side.
     */
    public double getSide2() {
        return side2;
    }

    /**
     * Get the length of the third side.
     * @return The length of the third side.
     */
    public double getSide3() {
        return side3;
    }

    /**
     * Calculate the perimeter of the triangle.
     * @return The perimeter of the triangle.
     */
    private double perimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Check if the triangle is valid.
     * @return True if the triangle is valid, false otherwise.
     */
    public boolean isValid() {
        return (side1 + side2 > side3
                && side2 + side3 > side1
                && side3 + side1 > side2);
    }

    /**
     * Calculate the area of the triangle.
     * @return The area of the triangle, or -1 if the triangle is not valid.
     */
    public double area() {
        if (!isValid()) {
            return -1;
        }
        double semiPerimeter = semiPerimeter();
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1)
                * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    /**
     * Get the type of the triangle.
     * @return The type of the triangle.
     */
    public String getType() {
        if (!isValid()) {
            return "Invalid";
        } else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3
                   || side3 == side1) {
            if (isRightAngle()) {
                return "Right angle and Isosceles";
            } else {
                return "Isosceles";
            }
        } else {
            if (isRightAngle()) {
                return "Right angle and Scalene";
            } else {
                return "Scalene";
            }
        }
    }

    /**
     * Check if the triangle is a right angle triangle.
     * @return True if the triangle is a right angle triangle,
     * false otherwise.
     */
    // a2, b2, and c2 are square of each side
    private boolean isRightAngle() {
        double a2 = side1 * side1;
        double b2 = side2 * side2;
        double c2 = side3 * side3;
        return (a2 + b2 == c2
                || b2 + c2 == a2
                || c2 + a2 == b2);
    }

    /**
     * Calculate the semi-perimeter of the triangle.
     * @return The semi-perimeter of the triangle.
     */
    public double semiPerimeter() {
        if (!isValid()) {
            return -1;
        }
        return perimeter() / 2;
    }

    /**
     * Calculate the specified angle of the triangle.
     * @param angleNumber - The angle number (1, 2, or 3).
     * @return The angle in radians, or -1 if the triangle is not valid.
     */
    public double angle(final int angleNumber) {
        if (!isValid()) {
            return -1;
        }
        double a2 = side1 * side1;
        double b2 = side2 * side2;
        double c2 = side3 * side3;
        if (angleNumber == 1) {
            return Math.acos((b2 + c2 - a2)
                             / (2 * side2 * side3));
        } else if (angleNumber == 2) {
            return Math.acos((a2 + c2 - b2)
                             / (2 * side1 * side3));
        } else if (angleNumber == 3) {
            return Math.acos((a2 + b2 - c2)
                             / (2 * side1 * side2));
        } else {
            return -1;
        }
    }

    /**
     * Calculate the height relative to the specified side of the triangle.
     * @param sideNumber - The side number (1, 2, or 3).
     * @return The height in millimeters, or -1 if the triangle is
     * not valid.
     */
    public double height(final int sideNumber) {
        if (!isValid()) {
            return -1;
        }
        double area = area();
        if (sideNumber == 1) {
            return (2 * area) / side1;
        } else if (sideNumber == 2) {
            return (2 * area) / side2;
        } else if (sideNumber == 3) {
            return (2 * area) / side3;
        } else {
            return -1;
        }
    }

    /**
     * Calculate the radius of the largest inscribed circle within the triangle.
     * @return The radius in millimeters, or -1 if the triangle is not valid.
     */
    public double innerCircleRadius() {
        if (!isValid()) {
            return -1;
        }
        double area = area();
        double semiPerimeter = semiPerimeter();
        return area / semiPerimeter;
    }

    /**
     * Calculate the radius of the circumscribed circle around the triangle.
     * @return The radius in millimeters, or -1 if the triangle is not valid.
     */
    public double circumsicleRadius() {
        if (!isValid()) {
            return -1;
        }
        double a = side1;
        double b = side2;
        double c = side3;
        double area = area();
        return (a * b * c) / (4 * area);
    }
}
