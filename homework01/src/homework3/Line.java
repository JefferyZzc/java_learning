package homework3;

import java.util.ArrayList;
import java.util.List;

public class Line extends MapElement{
    List<Point> l1 = new ArrayList<>();

    int size;
    public Line()
    {
        size=0;
    }
    public void move(double x,double y)
    {
        for(Point p : l1)
        {
            p.x += x;
            p.y += y;
        }
    }
    public Point get(int i)
    {
        return l1.get(i);
    }

    public void insert(Point p1)
    {
        l1.add(p1);
        size++;
    }
}
