package InMemoryModel;

import ModelElements.Flash;
import ModelElements.PolygonalModel;
import ModelElements.Scene;
import ModelElements.Camera;

/**
 * Хранилище моделей
 */
public class ModelStore {
    PolygonalModel Models;
    Scene Scene;
    Flash Flashes;
    Camera Cameras;

    private IModelChangedObserver changedObserver;

    /**
     * получить сцену по id
     * @param mySceneId
     * @return возвращает сцену
     */
    public Scene GetScene(int mySceneId){
        return new Scene();
    }

    /**
     * извещение о смене модели
     * @param changer смещение
     * @return результат смены модели
     */
    public IModelChanger NotifyChange(IModelChanger changer){
        return changer;
    }
}
