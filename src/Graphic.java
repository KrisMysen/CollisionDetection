/**
 * Created by Kristoffer on 30.07.2015.
 */
public class Graphic {

    private int x;
    private int y;
    private final int width;
    private final int height;

    public Graphic(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }



}
