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

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.awt.*;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
//        int[] aliceMoves = {1,3,1,2};
//        DancingBug alice = new DancingBug(aliceMoves);
//        alice.setColor(Color.ORANGE);
        // 1 is a left turn. 0 is a right turn
        // dragon curve: start with 1. next iteration is append a 1 and then repeat your last iteration but with the middle digit complemented. So: (1) 1 (0) which gives us 110. Next iteration is (110)1(100)
        int[] bobMoves = {0,  2,2,6,2,2,6,6,2,2,2,6,6,2,6,6};
        DancingBug bob = new DancingBug(bobMoves);
//        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}