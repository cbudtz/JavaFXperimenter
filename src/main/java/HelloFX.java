import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        String version = System.getProperty("javafx.version");
        Label label = new Label("Hello from JavaFX: " + version);
        Scene scene = new Scene(new StackPane(label), 640,480);
        stage.setScene(scene);
        stage.show();

    }
}
