/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class JumperRunner
{
    public static void main(String[] args)
    {
        BoundedGrid<Actor> gr = new BoundedGrid<Actor>(100,100);
        ActorWorld world = new ActorWorld(gr);
        Jumper alice = new Jumper(6);
        alice.setColor(Color.ORANGE);
        Jumper charlie = new Jumper(6);
        charlie.setColor(Color.ORANGE);
        Jumper bob = new Jumper(3);
        Rock rocky1 = new Rock();
        Rock rocky2 = new Rock();
//        r@21ocky1.putSelfInGrid(gr, new Location(-1,5));
//        rocky1.putSelfInGrid(gr, new Location(-1,8));

        world.add(new Location(7, 8), charlie);
        world.add(new Location(3, 4), alice);
        world.add(new Location(5, 5), bob);

        alice.setDirection(Location.WEST);

        world.show();
    }
}