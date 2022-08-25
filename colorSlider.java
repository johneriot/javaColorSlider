
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johne
 */
public class test1 extends Application {
    
     private double red;
    private double green;
    private double blue;
    private double opacity;
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane circlePane = new FlowPane();
        Circle circle = new Circle(100);
        circlePane.getChildren().add(circle);
        
        FlowPane sliderPane = new FlowPane();
        BorderPane borderPane = new BorderPane();
        
        Slider slRed = new Slider();
        slRed.setMax(1);
        slRed.setValue(1);
        slRed.valueProperty().addListener(ov -> {
            red = slRed.getValue();
            circle.setFill(Color.color(red, green, blue, opacity));
        });
        
        Slider slGreen = new Slider();
        slGreen.setMax(1);
        slGreen.setValue(1);
        slGreen.valueProperty().addListener(ov -> {
            green = slGreen.getValue();
            circle.setFill(Color.color(red, green, blue, opacity));
        });
        
        Slider slBlue = new Slider();
        slBlue.setMax(1);
        slBlue.setValue(1);
        slBlue.valueProperty().addListener(ov -> {
            blue = slBlue.getValue();
            circle.setFill(Color.color(red, green, blue, opacity));
        });
        
        Slider slOpacity = new Slider();
        slOpacity.setMax(1);
        slOpacity.setValue(1);
        slOpacity.valueProperty().addListener(ov -> {
            opacity = slOpacity.getValue();
            circle.setFill(Color.color(red, green, blue, opacity));
        });
        
        
        sliderPane.getChildren().addAll(slRed,slGreen,slBlue,slOpacity);
        
        
        
        borderPane.setCenter(circlePane);
        borderPane.setBottom(sliderPane);
        
        
        Scene scene = new Scene(borderPane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
