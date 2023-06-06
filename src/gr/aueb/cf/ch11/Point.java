package gr.aueb.cf.ch11;

/**
 * A simple {@link Point} Java Bean.
 *
 * @version 1.1
 * @since 0.1
 * @author a8ana
 */
public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public String pointToString() {
        return "(" + x + ", " + y + ")";
    }
}
