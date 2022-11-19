package homework3;

import homework1.MyPoint;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(1,2);
        Point point3 = new Point(1,3);
        Point point4 = new Point(1,4);
        Line line1 = new Line();
        line1.insert(point1);
        line1.insert(point2);
        line1.insert(point3);
        line1.insert(point4);
        Point point5 = new Point(2,1);
        Point point6 = new Point(2,2);
        Point point7 = new Point(2,3);
        Point point8 = new Point(2,4);
        List<MapElement> list = new ArrayList<>();
        list.add(line1);
        list.add(point5);
        list.add(point6);
        list.add(point7);
        list.add(point8);
        MapTool mp = new MapTool();
        mp.move(list,2,2);
        for(int i =0;i< line1.size;i++)
        {
            System.out.println(line1.get(i).getX()+","+line1.get(i).getY());
        }
        System.out.println(point5.getX()+","+point5.getY());
    }
}
