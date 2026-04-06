import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{
    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> res = new ArrayList<Actor>();
        Grid<Actor> gr = getGrid();
        Actor elt = null;
        Location loc;
        loc = getLocation().getAdjacentLocation(getDirection());
        if (gr.isValid(loc))
            elt = gr.get(loc);
        if (elt != null)
            res.add(elt);
//        elt = getGrid().get(getLocation().getAdjacentLocation(getDirection()+ Location.HALF_CIRCLE));
        loc = getLocation().getAdjacentLocation(getDirection()+ Location.HALF_CIRCLE);
        if (gr.isValid(loc))
            elt = gr.get(loc);
        if (elt != null)
            res.add(elt);
        return res;
    }
}
