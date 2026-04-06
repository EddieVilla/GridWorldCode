import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{
//    public ArrayList<Actor> getActors2()
//    {
//        ArrayList<Actor> res = new ArrayList<Actor>();
//        Grid<Actor> gr = getGrid();
//        Actor elt = null;
//        Location loc;
//        loc = getLocation().getAdjacentLocation(getDirection());
//        if (gr.isValid(loc))
//            elt = gr.get(loc);
//        if (elt != null)
//            res.add(elt);
////        elt = getGrid().get(getLocation().getAdjacentLocation(getDirection()+ Location.HALF_CIRCLE));
//        loc = getLocation().getAdjacentLocation(getDirection()+ Location.HALF_CIRCLE);
//        if (gr.isValid(loc))
//            elt = gr.get(loc);
//        if (elt != null)
//            res.add(elt);
//        return res;
//    }

    public ArrayList<Actor> getActors() {
        ArrayList<Actor> actors = new ArrayList<Actor>();
        int[] dirs = {Location.AHEAD, Location.HALF_CIRCLE};
        for(Location loc : getLocationsInDirections(dirs)) {
            Actor a = getGrid().get(loc);
            if (a != null) {
                actors.add(a);
            }
        }
        return actors;
    }

    public ArrayList<Location> getLocationsInDirections(int[] directions) {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid<Actor> gr = getGrid();
        for(int d : directions) {
            Location loc = getLocation().getAdjacentLocation(getDirection()+ d);
            if(gr.isValid(loc)) {
                locs.add(loc);
            }
        }
        return locs;
    }
}
