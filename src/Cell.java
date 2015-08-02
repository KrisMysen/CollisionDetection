import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kristoffer on 30.07.2015.
 */
public class Cell {

    private final List<Graphic> graphicsInCell = new ArrayList<Graphic>();

    public Cell() {
    }

    public void addGraphic(Graphic graphic) {
        graphicsInCell.add(graphic);
    }

    public void clear() {
        graphicsInCell.clear();
    }

}
