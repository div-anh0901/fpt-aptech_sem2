interface Movable {

    public void moveUp();

    public void moveDown();

    public void moveLeft();

    public void moveRight();

}

class MovablePoint implements Movable {
    private double x;
    private double y = 0;

    public void moveUp() {
        System.out.println(this.y++);
    }

    public void moveDown() {
        System.out.println(this.y--);
    }

    public void moveLeft() {
        System.out.println(this.x--);
    }

    public void moveRight() {
        System.out.println(this.x++);
    }

    public static void main(String args[]) {
        MovablePoint moval = new MovablePoint();
        moval.moveUp();// return 1
        moval.moveDown();// return 1 -1 = 0
        moval.moveLeft();// return 1
        moval.moveRight();// return 1- 1 =0
    }
}
