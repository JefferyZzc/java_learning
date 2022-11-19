package homework1;

public class MyPoint {
    int x;
    int y;
    public MyPoint() {
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x, int y) {
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

   double distance(MyPoint otherPoint)
   {
        return Math.sqrt(Math.pow(this.x-otherPoint.getX(),2)+Math.pow(this.y-otherPoint.getY(),2));
   }

   double distance(double x,double y)
   {
       return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
   }
}
