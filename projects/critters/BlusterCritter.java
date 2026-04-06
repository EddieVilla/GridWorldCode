import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.*;
import java.util.ArrayList;

public class BlusterCritter extends Critter {
    private static int cour;

    public BlusterCritter(int courage)
    {
        cour = courage;
    }

    public ArrayList<Actor> getActors() {
        ArrayList<Actor> actors = new ArrayList<Actor>();

        return actors;
    }

    public void processActors(ArrayList<Actor> actors) {
        if (actors.size() > cour) {
            setColor(getColor().darker());
        } else if (actors.size() < cour) {
            setColor(getColor().brighter());
        }
    }


}
