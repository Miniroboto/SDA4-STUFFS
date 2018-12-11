package Poligoane;

public class Point {
    protected Double x;
    protected Double y;

    public Point(Double x, Double y) {
        setX(x);
        setY(y);
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void translatie (Double dx, Double dy){
         this.x+=dx;
         this.y+=dy;

    }
    public void scalare (double s) {
        this.x*=s;
        this.y*=s;
    }
    public void flip (){
        double temp1= this.x;
        double temp2=this.y;
        x=-temp2;
        y=-temp1;
       }

    public int quadrant () {
        if ((x>0)&&(y>0)){
            return 1;}
        else if ((x<0)&&(y>0)){
            return 2;}
        else if ((x<0)&&(y<0)){
            return  3;}
        else if ((x>0)&&(y<0)){
            return 4;}
        else {
            return 0;}
    }
    public double manhattanDistance(Point other){
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        double distM = Math.sqrt (dx*dx)+ Math.sqrt (dy*dy);
        return distM;
    }


    public boolean isVertical(Point other){
        if (this.x.equals(other.x)){
            return true;}
        else return false;
    }




    @Override
    public String toString() {
      return   "Coordonatele punctului sunt " + x + " " + y + " ";
    }



}
