package ss06_inheritance_polymorphism.execise.point_moveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint(){
    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }

    public float getXSpeed(){
        return xSpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }

    public float getYSpeed(){
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{getXSpeed(),getYSpeed()};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x="+ super.getX()+
                ", y="+ super.getY()+"} ";
    }

   public MoveablePoint move (){
       super.setX(super.getX() + getXSpeed());
       super.setY(super.getY() + getYSpeed());
       return this;
   }

}
