package Poligoane;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public abstract class Poligon {

    protected List<Point> points = new LinkedList<>();


    public void scalare(Double s) {

        for (Point x : points) {
            x.scalare(s);
        }

    }

    public void translatie(double dx, Double dy) {
        for (Point x : points) {
            x.translatie(dx, dy);
        }
    }
        public abstract Double getArea ();
        public abstract void paint (Graphics g) ;

        public Double getPerimeter () throws Exception
        {
            if (points.size()<3)
            {
                throw new Exception("Nu e un poligon");
            }

            Double perimeter =0d;
            for (int i=0; i< points.size()-1;++i){
                Point a= points.get(i);
                Point b= points.get(i+1);
                perimeter+=distance(a,b);
            }
            perimeter+= distance(points.get(0),points.get(points.size()-1));
            return perimeter;
        }
        protected Double distance (Point a, Point b) {
            Double dy= b.getY()-a.getY();
            Double dx = b.getX()-a.getX();
            return Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2) );
        }


    }
