package own.background;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;


public class PapStoSci extends Application {

    private Image image = new Image("background/tlo.png");

    public static void main(String[]args){
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100,100,true,true,true,false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane gridPane = new GridPane();
        gridPane.setBackground(background);





        Scene scene = new Scene(gridPane, 600 ,400, Color.YELLOW);




        primaryStage.setTitle("PaperGame");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
