package Poligoane;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        Point punct1 = new Point(5.0,3.2);
//        Point punct2 = new Point(5.0,9.0);
//        System.out.println(punct1.isVertical(punct2));
//
//        punct1.translatie(2.0, 3.0);
//        System.out.println(punct1);
//        punct1.scalare(3.0);
//        System.out.println(punct1);
//        punct1.flip();
//        System.out.println(punct1);
//        System.out.println(punct1.quadrant());
//        System.out.println(punct1.isVertical(punct2));

        List <Point> punctePatrat = new ArrayList<>(4);
        punctePatrat.add(new Point(0d,0d));
        punctePatrat.add(new Point(0d,50d));
        punctePatrat.add(new Point(50d,50d));
        punctePatrat.add(new Point(50d,0d));
        try {
            Poligon poli = new Patrat(punctePatrat);
            System.out.println("Perimetru " +poli.getPerimeter());
            System.out.println("Aria " + poli.getArea());
            BufferedImage image = new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
            Graphics imageGraphics = image.getGraphics();
            poli.paint(imageGraphics);
            File output = new File ("poligon.png");
            ImageIO.write(image, "png", output);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
