import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Jumper extends Bug {

    private int len;

    public Jumper() {
        len = 2;
    }

    public Jumper(int length) {
        len = length;
    }

    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        for (int i = 0; i < len; i++) {
            loc = getLocation();
            next = loc.getAdjacentLocation(getDirection());
            if (gr.isValid(next))
                moveTo(next);
            else
                removeSelfFromGrid();
            Flower flower = new Flower(getColor());
            flower.putSelfInGrid(gr, loc);
        }

    }

    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc;
        for (int i = 0; i < len; i++) {
            next = loc.getAdjacentLocation(getDirection());
            if (!gr.isValid(next))
                return false;
            loc = next;
        }
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }

}
