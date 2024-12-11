import java.util.ArrayList;
import java.util.List;

class Board {
    private int size;
    private List<Mover> movers;

    public Board(int size) {
        this.size = size;
        this.movers = new ArrayList<>();
    }

    public void addMover(Mover mover) {
        movers.add(mover);
    }

    public int getFinalPosition(int position) {
        for (Mover mover : movers) {
            if (mover.getStart() == position) {
                return mover.getEnd();
            }
        }
        return position; // No mover at this position
    }

    public int getSize() {
        return size;
    }
}
