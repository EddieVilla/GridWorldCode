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
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.awt.*;
import java.util.Arrays;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static int[] getDragonCurveArray(int iterations) {
        iterations -= 1;
        String start = "1";
        int[] result;
        int i;
        String tmp;
        for (int itr=0;itr<iterations;itr++) {
            i = start.length() / 2;
            tmp = start + "1" + start.substring(0, i) + String.valueOf((Integer.parseInt(start.substring(i, i + 1)) + 1) % 2) + start.substring(i + 1);
            start = tmp;
        }
        start = start.replace("1", "2,").replace("0","6,");
        start = start.substring(0,start.length()-1);
        result = Arrays.stream(start.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        return result;
    }

    /**
     * 1 is a left turn. 0 is a right turn
     * dragon curve: start with 1. next iteration is append a 1 and then repeat your
     * last iteration but with the middle digit complemented. So: (1) 1 (0) which
     * gives us 110. Next iteration is (110)1(100)
     *
     * @param dmoves are the dance moves for the bug
     * @return nothing
     */
    public static void runGrid(int[] dmoves) {
        ActorWorld world = new ActorWorld(new UnboundedGrid<>());
        int[] bobMoves = dmoves;
        DancingBug bob = new DancingBug(bobMoves);
        bob.setDirection(180);
        world.add(new Location(5, 5), bob);
        world.show();
    }
    public static void main(String[] args)
    {
        //test1
        System.out.println("test1");
        // length is 2^(iterations)-1
        for (int elt : getDragonCurveArray(2)) {
            System.out.print(elt);
        }

        //gui visual test
        runGrid(getDragonCurveArray(9));
    }
}