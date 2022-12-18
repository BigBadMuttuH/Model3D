package ModelElements;


import java.util.ArrayList;
import java.util.List;

/**
 * класс сцена
 */
public class Scene<Type1, Type2> {
    public int Id;
    public List<PolygonalModel> models = new ArrayList<>();
    public List<Flash> flashes = new ArrayList<>();
    public List<Camera> cameras = new ArrayList<>();


    /**
     * класс сцена
     * @param polygonalModel
     * @param camera
     * @param flash
     */
    public Scene(PolygonalModel polygonalModel, Camera camera, Flash flash){
        models.add(polygonalModel);
        cameras.add(camera);
        flashes.add(flash);
        Id += 1;
    }

    public Type1 method1(Type1 t1){
        return t1;
    };
    public Type2 method2(Type2 t2){
        return t2;
    }

}
