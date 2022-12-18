package InMemoryModel;

/**
 * смена модели
 */
public interface IModelChanger {
    /**
     * извещение о смене модели
     */
    void notifyChange(IModelChanger sender);
}
