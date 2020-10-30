public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }


    // Return the perimeter without any rounding.
  public double getPerimeter() {
    double first = v1.distanceTo(v2);
    double second = v2.distanceTo(v3);
    double third = v3.distanceTo(v1);
    return (first + second + third);
  }

    // Return the area using Heron's formula without any rounding.
  public double getArea() {
    double semi = getPerimeter()/2;
    double first = v1.distanceTo(v2);
    double second = v2.distanceTo(v3);
    double third = v3.distanceTo(v1);
    return (Math.pow((semi * (semi - first) * (semi - second) * (semi - third)), 0.5));
  }

  // *spelling correction*
  // Return the "equilateral" "isosceles" or "scalene" Round distances to the nearest tenthousandths for your classifications.
  public String classify() {
    double first = v1.distanceTo(v2);
    double second = v2.distanceTo(v3);
    double third = v3.distanceTo(v1);
    if (first == second && second == third) {
      return "equilateral";
    } else if (first == second || first == third || second == third) {
      return "isosceles";
    } else {
      return "scalene";
    }
  }

  // The format should be "v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"
  public String toString() {
    return ("v1(" + v1.getX() + ", " + v1.getY() + ") v2(" + v2.getX() + ", " + v2.getY() + ") v3(" + v3.getX() + ", " + v3.getY() + ")");
  }

  // - replace the specified Point (0,1, or 2) with the new Point
  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    } else if (index == 1) {
      v2 = newP;
    } else if (index == 2) {
      v3 = newP;
    }
  }

}
