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
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class ScratchBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
//        Location loc1 = new Location(4,3);
//        Location loc2 = new Location(3,4);

        // DONE. All correct
//        System.out.println(loc1.getRow()); //4
//        System.out.println(false);
//        System.out.println(loc2.getAdjacentLocation(Location.SOUTH));//4,4
//        System.out.println(loc1.getDirectionToward(new Location(6,5)));//135
        //takes the row and col and checks if it is a valid location? No, just generates new location using row and col and returns that obj

        
        
        BoxBug alice = new BoxBug(6);
        alice.setColor(Color.ORANGE);
        BoxBug charlie = new BoxBug(6);
        charlie.setColor(Color.ORANGE);
        BoxBug bob = new BoxBug(3);
        world.add(new Location(7, 8), charlie);
        world.add(new Location(3, 4), alice);
        alice.setDirection(Location.WEST);
        world.add(new Location(5, 5), bob);

        Grid<Actor> myGrid = bob.getGrid();
        bob.removeSelfFromGrid();
        bob.putSelfInGrid(myGrid, new Location(3,3));
        bob.removeSelfFromGrid();
        bob.putSelfInGrid(myGrid, new Location(3,3));
        bob.setDirection(Location.EAST);
        System.out.println(myGrid.isValid(new Location(9,0)));

        // putselfingrid, removeselffromgrid, act
        // blue, north
        // because it has state and can be instantiated
        // no, no, yes. appears as if it was always there
        // setDirection(getDirection()+RIGHT)
        
        
        world.show();
    }
}