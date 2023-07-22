package ir.ac.kntu;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Scanner;

public class JavaFxApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        root.setStyle("-fx-border-width: 0 0 5 0; -fx-border-style: dotted;");
        Scene scene = new Scene(root, 600, 600, Color.WHITE);
        int depth = getDepth();
        RecursiveGUI recursiveGUI = new RecursiveGUI();
        recursiveGUI.drawShape(root, 0,0,600, depth);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("Recursion in JavaFX!");
        stage.setScene(scene);
        stage.show();
    }

    public int getDepth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your considered depth:");
        return scanner.nextInt();
    }
}