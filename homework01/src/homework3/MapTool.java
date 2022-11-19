package homework3;

import java.util.List;

public class MapTool {
    public void move(List<MapElement> a,double x, double y)
    {
        for(MapElement e : a)
        {
            e.move(x,y);
        }
    }
}
