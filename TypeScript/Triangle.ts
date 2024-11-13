/**
 * The 'Triangle' Class
 * By:             Sam Corbett
 * Version:        1.0
 * Since:          2024/11/12
 */

class Triangle {
  private readonly side1: number
  private readonly side2: number
  private readonly side3: number

  /**
     * Create a triangle.
     * @param {number} side1 - The length of the first side.
     * @param {number} side2 - The length of the second side.
     * @param {number} side3 - The length of the third side.
     */
  constructor (side1: number, side2: number, side3: number) {
    this.side1 = side1
    this.side2 = side2
    this.side3 = side3
  }

  /**
     * Get the length of the first side.
     * @return {number} The length of the first side.
     */
  public getSide1 (): number {
    return this.side1
  }

  /**
     * Get the length of the second side.
     * @return {number} The length of the second side.
     */
  public getSide2 (): number {
    return this.side2
  }

  /**
     * Get the length of the third side.
     * @return {number} The length of the third side.
     */
  public getSide3 (): number {
    return this.side3
  }

  /**
     * Calculate the perimeter of the triangle.
     * @return {number} The perimeter of the triangle.
     * @private
     */
  private perimeter (): number {
    return this.side1 + this.side2 + this.side3
  }

  /**
     * Check if the triangle is valid.
     * @return {boolean} True if the triangle is valid, false otherwise.
     */
  public isValid (): boolean {
    return (
      this.side1 + this.side2 > this.side3 &&
        this.side2 + this.side3 > this.side1 &&
        this.side3 + this.side1 > this.side2
    )
  }

  /**
     * Calculate the area of the triangle.
     * @return {number} The area of the triangle, or -1 if the triangle is not valid.
     */
  public area (): number {
    if (!this.isValid()) return -1
    const semiPerimeter = this.semiPerimeter()
    return Math.sqrt(semiPerimeter * (semiPerimeter - this.side1) *
          (semiPerimeter - this.side2) * (semiPerimeter - this.side3))
  }

  /**
     * Get the type of the triangle.
     * @return {string} The type of the triangle.
     */
  public getType (): string {
    if (!this.isValid()) {
      return 'Invalid'
    } else if (this.side1 === this.side2 && this.side2 === this.side3) {
      return 'Equilateral Triangle'
    } else if (this.side1 === this.side2 || this.side2 === this.side3 ||
                 this.side3 === this.side1) {
      if (this.isRightAngle()) {
        return 'Isosceles Triangle with Right Angle'
      } else {
        return 'Isosceles Triangle'
      }
    } else {
      if (this.isRightAngle()) {
        return 'Scalene Triangle with Right Angle'
      } else {
        return 'Scalene Triangle'
      }
    }
  }

  /**
     * Check if the triangle is a right angle triangle.
     * @return {boolean} True if the triangle is a right angle triangle,
     * false otherwise.
     * @private
     */

  // a2, b2, and c2 are square of each side
  private isRightAngle (): boolean {
    const a2 = this.side1 ** 2
    const b2 = this.side2 ** 2
    const c2 = this.side3 ** 2
    return (a2 + b2 === c2 || b2 + c2 === a2 || c2 + a2 === b2)
  }

  /**
     * Calculate the semi-perimeter of the triangle.
     * @return {number} The semi-perimeter of the triangle.
     */
  public semiPerimeter (): number {
    return this.perimeter() / 2
  }

  /**
     * Calculate the specified angle of the triangle.
     * @param {number} angleNumber - The angle number (1, 2, or 3).
     * @return {number} The angle in radians, or -1 if the triangle is not valid.
     */
  public angle (angleNumber: number): number {
    if (!this.isValid()) return -1
    const a2 = this.side1 ** 2
    const b2 = this.side2 ** 2
    const c2 = this.side3 ** 2
    if (angleNumber === 1) {
      return Math.acos((b2 + c2 - a2) / (2 * this.side2 * this.side3))
    } else if (angleNumber === 2) {
      return Math.acos((a2 + c2 - b2) / (2 * this.side1 * this.side3))
    } else if (angleNumber === 3) {
      return Math.acos((a2 + b2 - c2) / (2 * this.side1 * this.side2))
    } else {
      return -1
    }
  }

  /**
     * Calculate the height relative to the specified side of the triangle.
     * @param {number} sideNumber - The side number (1, 2, or 3).
     * @return {number} The height in millimeters, or -1 if the triangle is
     * not valid.
     */
  public height (sideNumber: number): number {
    if (!this.isValid()) return -1
    const area = this.area()
    if (sideNumber === 1) {
      return (2 * area) / this.side1
    } else if (sideNumber === 2) {
      return (2 * area) / this.side2
    } else if (sideNumber === 3) {
      return (2 * area) / this.side3
    } else {
      return -1
    }
  }

  /**
     * Calculate the radius of the largest inscribed circle within the triangle.
     * @return {number} The radius in millimeters, or -1 if the triangle is not valid.
     */
  public innerCircleRadius (): number {
    if (!this.isValid()) return -1
    const area = this.area()
    const semiPerimeter = this.semiPerimeter()
    return area / semiPerimeter
  }

  /**
     * Calculate the radius of the circumscribed circle around the triangle.
     * @return {number} The radius in millimeters, or -1 if the triangle is not valid.
     */
  public circumsicleRadius (): number {
    if (!this.isValid()) return -1
    const a = this.side1
    const b = this.side2
    const c = this.side3
    const area = this.area()
    return (a * b * c) / (4 * area)
  }
}

export default Triangle
