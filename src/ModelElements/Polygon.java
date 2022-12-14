package ModelElements;


import Stuff.Point3D;
import java.util.ArrayList;
import java.util.List;

/**
 * полигон
 */
public class Polygon {
    /**
     * полигон по трем точкам
     * @param a
     * @param b
     * @param c
     * @return полигон
     */
    public List<Point3D> Points(Point3D a, Point3D b, Point3D c){
        List<Point3D> point3DList = new ArrayList<>();
        point3DList.add(a);
        point3DList.add(b);
        point3DList.add(c);

        return point3DList;
    }
};
