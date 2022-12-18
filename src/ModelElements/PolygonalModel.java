package ModelElements;


/**
 * полигональная модель
 */
public class PolygonalModel {
    public Polygon polygons;
    public Texture texture;

    /**
     * создать модель на основе подгружаемой текстуры
      * @param loadTexture
     */
    public PolygonalModel(Texture loadTexture){
        polygons = new Polygon();
        texture = loadTexture;
    }
}
