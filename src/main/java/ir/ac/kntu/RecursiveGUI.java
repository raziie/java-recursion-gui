package ir.ac.kntu;

import com.sun.javafx.scene.paint.GradientUtils;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

import javax.swing.*;
import java.util.Random;

public class RecursiveGUI {

    public void drawShape(Pane root, double x, double y, double side, int depth) {
        double subSide = side / 2;
        Rectangle rectangle = new Rectangle(x , y, side, side);
        rectangle.setStrokeWidth(1);
        rectangle.setStroke(Color.BLACK);
        root.getChildren().add(rectangle);
        setColor(rectangle);
        if (subSide >= depth) {
            if(new Random().nextBoolean()) {
                switch (new Random().nextInt(5)) {
                    case 0 -> {
                        drawShape(root, x, y, subSide, depth);
                        drawShape(root, x + subSide, y, subSide, depth);
                    }
                    case 1 -> {
                        drawShape(root, x + subSide, y, subSide, depth);
                        drawShape(root, x + subSide, y + subSide, subSide, depth);
                    }
                    case 2 -> {
                        drawShape(root, x, y + subSide, subSide, depth);
                        drawShape(root, x + subSide, y + subSide, subSide, depth);
                    }
                    case 3 -> {
                        drawShape(root, x, y, subSide, depth);
                        drawShape(root, x, y + subSide, subSide, depth);
                    }
                    case 4 -> {

                    }
                }
            }else {
                drawShape(root, x, y, subSide, depth);
                drawShape(root, x + subSide, y, subSide, depth);
                drawShape(root, x, y + subSide, subSide, depth);
                drawShape(root, x + subSide, y + subSide, subSide, depth);
            }
        }
    }

    public void setColor(Rectangle rectangle) {
        switch (new Random().nextInt(4)) {
            case 0 -> rectangle.setFill(Color.RED);
            case 1 -> rectangle.setFill(Color.BLUE);
            case 2 -> rectangle.setFill(Color.YELLOW);
            case 3 -> rectangle.setFill(Color.WHITE);
        }
    }
}