package ModelElements;


import java.util.ArrayList;
import java.util.List;

public class Polygon {
    public List<Point3D> Points(Point3D a, Point3D b, Point3D c){
        List<Point3D> point3DList = new ArrayList<>();
        point3DList.add(a);
        point3DList.add(b);
        point3DList.add(c);

        return point3DList;
    }
};
