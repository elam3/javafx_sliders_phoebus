import javafx.application.*;
import javafx.beans.value.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;

public class HelloSlider extends Application {
    @Override
    public void start(Stage stage) {

        Group root = new Group();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Slider Sample");

        VBox vbox = new VBox(8);

        Slider knob1 = new Slider(0, 100, 50);
        knob1.setShowTickMarks(true);
        knob1.setShowTickLabels(true);
        knob1.setMajorTickUnit(10f);
        knob1.setBlockIncrement(1f);

        Slider knob2 = new Slider(0, 100, 50);
        knob2.setShowTickMarks(true);
        knob2.setShowTickLabels(true);
        knob2.setMajorTickUnit(10f);
        knob2.setBlockIncrement(1f);

        vbox.getChildren().addAll(knob1, knob2);

        root.getChildren().add(vbox);

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.F3) {
                    knob1.decrement();
                } else if (ke.getCode() == KeyCode.F4) {
                    knob1.increment();
                } else if (ke.getCode() == KeyCode.F7) {
                    knob2.decrement();
                } else if (ke.getCode() == KeyCode.F8) {
                    knob2.increment();
                }
            }
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
