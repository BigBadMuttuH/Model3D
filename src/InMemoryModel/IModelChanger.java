package InMemoryModel;

/**
 * смена модели
 */
public interface IModelChanger {
    /**
     * извещение о смене модели
     */
    static IModelChanger NotifyChange(IModelChanger sender){
        return sender;
    }
}
