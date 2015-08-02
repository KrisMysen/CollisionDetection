/**
 * Created by Kristoffer on 31.07.2015.
 */
public class Grid {


    private final int cellSize;
    private int spaceHeight;

    private final int x0;
    private final int y0;

    private Cell[][] grid;

    public Grid(int cellSize) {
        this.cellSize = cellSize;
        this.x0 = 0;
        this.y0 = 0;
    }

    public void initGrid(int spaceWidth, int spaceHeight) {
        this.spaceHeight = spaceHeight;
        int columnSize = spaceWidth / cellSize;

        grid = new Cell[columnSize][];
    }

    public void initColumn(int index) {

        if (grid[index] == null) {
            int value = spaceHeight / cellSize;
            grid[index] = new Cell[value];
        }

    }


}
