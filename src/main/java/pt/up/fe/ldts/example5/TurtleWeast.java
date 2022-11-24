package pt.up.fe.ldts.example5;

public class TurtleWeast extends TurtleState{
    public TurtleWeast() { }
    public TurtleWeast(Turtle turtle) {
        this.turtle = turtle;
    }
    @Override
    public void moveForward() {
        turtle.setColumn(turtle.getColumn() - 1);
    }
    @Override
    public void rotateRight() {
        turtle.setDirection(new TurtleNorth(turtle));
    }
    @Override
    public void rotateLeft() {
        turtle.setDirection(new TurtleSouth(turtle));
    }
}
