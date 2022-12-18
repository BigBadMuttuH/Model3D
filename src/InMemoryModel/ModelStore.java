package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Хранилище моделей
 */
public class ModelStore implements IModelChanger {
    public List<PolygonalModel> models = new ArrayList<PolygonalModel>();
    public List<Scene> scenes = new ArrayList<Scene>();
    public List<Flash> flashes = new ArrayList<Flash>();
    public List<Camera> cameras = new ArrayList<Camera>();
    private List<IModelChangedObserver> changedObservers = new ArrayList<IModelChangedObserver>();

    /**
     * конструктор модели в хранилище
     * @param texture
     */
    public ModelStore(Texture texture){
        models.add(new PolygonalModel(texture));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(models.get(0), cameras.get(0), flashes.get(0)));
    }

    /**
     * интерфейс IModelChanger
     * @param sender
     */
    @Override
    public void notifyChange(IModelChanger sender){

    }

    /**
     * получить сцену по ID
     * @param sceneID
     * @return
     */
    public Scene getScene(int sceneID){
        return scenes.get(sceneID);
    }
}
