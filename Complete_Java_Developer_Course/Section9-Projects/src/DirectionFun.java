

public class DirectionFun {

    private enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST;
    }

    public static void main(String[] args) {
        Direction direction = Direction.NORTH;

        switch (direction) {
            case NORTH:
                System.out.println("You're traveling north!");
                break;
            case SOUTH:
                System.out.println("You're traveling south!");
                break;
            case EAST:
                System.out.println("You're traveling east!");
                break;
            case WEST:
                System.out.println("You're traveling west!");
                break;
        }
    }
}
