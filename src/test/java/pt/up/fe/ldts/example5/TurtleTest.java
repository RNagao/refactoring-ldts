package pt.up.fe.ldts.example5;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class TurtleTest {
    @Test
    public void testRotateLeft() {
        TurtleNorth turtleNorth = new TurtleNorth();
        Turtle turtle = new Turtle(5, 5, turtleNorth);
        turtle.execute('L'); assertEquals('W', turtle.getDirection());
        turtle.execute('L'); assertEquals('S', turtle.getDirection());
        turtle.execute('L'); assertEquals('E', turtle.getDirection());
        turtle.execute('L'); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testRotateRight() {
        TurtleNorth turtleNorth = new TurtleNorth();
        Turtle turtle = new Turtle(5, 5, turtleNorth);
        turtle.execute('R'); assertEquals('E', turtle.getDirection());
        turtle.execute('R'); assertEquals('S', turtle.getDirection());
        turtle.execute('R'); assertEquals('W', turtle.getDirection());
        turtle.execute('R'); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testForward() {
        TurtleNorth turtleNorth = new TurtleNorth();
        Turtle turtleN = new Turtle(5, 5, turtleNorth);

        turtleN.execute('F');
        assertEquals(4, turtleN.getRow());
        assertEquals(5, turtleN.getColumn());

        TurtleWeast turtleWeast = new TurtleWeast();
        Turtle turtleW = new Turtle(5, 5, turtleWeast);

        turtleW.execute('F');
        assertEquals(5, turtleW.getRow());
        assertEquals(4, turtleW.getColumn());

        TurtleSouth turtleSouth = new TurtleSouth();
        Turtle turtleS = new Turtle(5, 5, turtleSouth);

        turtleS.execute('F');
        assertEquals(6, turtleS.getRow());
        assertEquals(5, turtleS.getColumn());

        TurtleEast turtleEast = new TurtleEast();
        Turtle turtleE = new Turtle(5, 5, turtleEast);

        turtleE.execute('F');
        assertEquals(5, turtleE.getRow());
        assertEquals(6, turtleE.getColumn());
    }

}