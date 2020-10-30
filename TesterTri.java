public class TesterTri {
  public static void main(String[] args) {
    Point myPoint = new Point(1.0, 2.0);
    Point otherPoint = new Point(1.0, 2.0);

    System.out.println(myPoint.getX() == 1.0);
    System.out.println(myPoint.getY() == 2.0);

    System.out.println(myPoint.distanceTo(otherPoint) == 0.0);
    System.out.println(myPoint.equals(otherPoint));
  }
}
