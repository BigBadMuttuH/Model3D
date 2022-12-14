package ModelElements;


import java.awt.Window;

/**
 * класс сцена
 */
public class Scene {
    public int id;
    public PolygonalModel Models;
    public Flash Flashes;

    /**
     * собрать сцену методом 1
     * @param window
     * @return
     */
    public Window.Type method1(Window.Type window){
        return window;
    };

    /**
     * собрать сцену методом 2
     * @param windowFirst
     * @param windowSecond
     * @return
     */
    public Window.Type method2(Window.Type windowFirst, Window.Type windowSecond){
        return windowFirst;
    }

}
