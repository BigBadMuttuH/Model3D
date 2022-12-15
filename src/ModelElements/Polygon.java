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
   * @param pointA
   * @param pointB
   * @param pointC
   * @return полигон
   */
  public List<Point3D> Points(Point3D pointA, Point3D pointB, Point3D pointC) {
    List<Point3D> point3DList = new ArrayList<>();
    point3DList.add(pointA);
    point3DList.add(pointB);
    point3DList.add(pointC);

    return point3DList;
  }
};
