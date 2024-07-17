public class MovablePoint implements Movable  {
private int x;
private int y;
private int xSpeed;
private int ySpeed;

    public MovablePoint(int y, int x, int xSpeed, int ySpeed) {
        this.y = y;
        this.x = x;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    @Override
    public void moveup() {
     this.y-=this.ySpeed;

    }

    @Override
    public void movedown() {
       this.y+=this.ySpeed;

    }

    @Override
    public void moveleft() {
       this.x-=this.xSpeed;

    }

    @Override
    public void moveRight() {
       this.x+=xSpeed;

    }
}
