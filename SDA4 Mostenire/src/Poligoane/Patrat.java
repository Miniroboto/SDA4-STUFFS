package Poligoane;


import java.awt.*;
import java.util.List;

public class Patrat extends Poligon
{   public static final Double TOLERANCE = 0.0000001;
    public static Color SQUARE_COLOR = Color.GREEN;
    public Patrat(List<Point> points)throws Exception
    {
    if(points.size()!=4){
        throw new Exception("Patratul are patru puncte!");
    }
    Double segmentSize= distance(points.get(0), points.get(points.size()-1));
    if (segmentSize.equals(0d))
    {
throw new Exception("Laturine nu pot avea dimensiunea 0");
    }
    for (int i=0; i<points.size()-1;i++){
        Point a= points.get(i);
        Point b= points.get(i+1);
        if(!segmentSize.equals(distance(a,b)))
        {
            throw new   Exception("Laturile nu sunt egale");
        }
    }
    Double diagonal = distance(points.get(0), points.get(2));
    Double val1=2*Math.pow(segmentSize,2);
    Double val2 = Math.pow(diagonal, 2);

    if (Math.abs(val1-val2)>TOLERANCE){
        throw new Exception("Unghiul nu e drept");
    }
super.points=points;

    }

    public Double getArea()
    {
        Point a = points.get(0);
        Point b = points.get(1);
        return Math.pow(distance(a,b), 2);
    }

    public void paint (Graphics g)
    {
        g.setColor(SQUARE_COLOR);
        for (int i=0; i<points.size()-1; ++i){
            Point a= points.get(i);
            Point b= points.get(i+1);
            g.drawLine(
                    (int)Math.round(a.getX()),
                    (int)Math.round(a.getY()),
                    (int) Math.round(b.getX()),
                    (int) Math.round(b.getY())
            );
        }
        Point a= points.get(0);
        Point b= points.get(points.size()-1);
        g.drawLine(
                (int)Math.round(a.getX()),
                (int)Math.round(a.getY()),
                (int) Math.round(b.getX()),
                (int) Math.round(b.getY())
        );
    }
}
