package homework3;

public class Point extends MapElement{
    int x;
    int y;
    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(double x,double y)
    {
        this.x += x;
        this.y += y;
    }
    public double getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
