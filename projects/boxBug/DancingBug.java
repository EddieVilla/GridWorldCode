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

import info.gridworld.actor.Bug;

import java.awt.*;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    private int[] danceMoves;
    private int j;
    private boolean keepGoing;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] myDanceMoves)
    {
        danceMoves = myDanceMoves;
        j = 0;
        keepGoing = true;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (keepGoing) {
            System.out.println("Beginning");
            super.act();
            move();
            for (int i = 0; i < danceMoves[j]; i++) {
                turn();
            }

            if (j == danceMoves.length - 1) {
                j = 0;
                keepGoing = false; //make the bug stop for now. can comment this line out if you want the bug to keep going
            } else {
                j = j + 1;
            }

            switch (j) {
                case 0:
                    this.setColor(Color.BLACK);
                    break;
                case 1:
                    this.setColor(Color.BLUE);
                    break;
                case 2:
                    this.setColor(Color.CYAN);
                    break;
                case 3:
                    this.setColor(Color.RED);
                    break;
                default:
                    System.out.println("ERROR in switch case statement");
                    break;
            }
        }
    }
}
