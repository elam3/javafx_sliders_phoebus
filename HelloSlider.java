import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class HelloSlider extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Slider Sample");

        //Slider slider = new Slider(0, 1, 0.5);
        Slider slider = new Slider(0, 100, 50);
        root.getChildren().add(slider);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
