package task;

public enum Direction {
    North,
    West,
    South,
    East;

    public Vector2 move(Vector2 start, double distance) {
        switch (this) {
            case South -> {
                return new Vector2(start.getX(), start.getY() + distance);
            }
            // same as East
            default -> {
                return new Vector2(start.getX() + distance, start.getY() );
            }
            case North -> {
                return new Vector2(start.getX(), start.getY() - distance);
            }
            case West -> {
                return new Vector2(start.getX() - distance, start.getY() );
            }
        }
    }
}
